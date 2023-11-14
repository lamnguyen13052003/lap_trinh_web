import modal.User;
import services.ServicesUser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Register", value = "/Register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

        String name = request.getParameter("name"),
                email = request.getParameter("email"),
                pass = request.getParameter("pass"),
                re_pass = request.getParameter("re_pass"),
                sex = request.getParameter("sex");
        if (!checkEmail(email)) {
            request.setAttribute("errorFormEmail", "Email không hợp lẹ!");
            request.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }

        if (!checkPassword(pass, re_pass)) {
            request.setAttribute("errorRePass", "Mật khẩu không khớp!");
            request.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }

        User user = new User();
        user.setFullName(name);
        user.setUserName(email);
        user.setPassword(pass);
        user.setSex(sex);

        ServicesUser servicesUser = ServicesUser.instance;
        servicesUser.setUser(user);

        request.setAttribute("thanh_cong", "Đăng ký thành công!");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    private boolean checkEmail(String email) {
        int indexACong = email.indexOf("@"), indexDot = email.indexOf(".");
        if (indexACong <= 0 || indexDot <= indexACong + 1) {
            return false;
        }
        return true;
    }

    private boolean checkPassword(String password, String re_password) {
        return password.equals(re_password);
    }
}