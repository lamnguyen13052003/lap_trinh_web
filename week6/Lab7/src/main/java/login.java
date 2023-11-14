import modal.User;
import services.ServicesUser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email") != null ? request.getParameter("email") : "";
        String password = request.getParameter("password") != null ? request.getParameter("password") : "";
        int indexACong = email.indexOf("@"), indexDot = email.indexOf(".");
        if(indexACong <= 0 || indexDot <= indexACong + 1){
            request.setAttribute("errorFormEmail", "Email không hợp lẹ!");
            request.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }

        ServicesUser servicesUser = ServicesUser.instance;
        User user = servicesUser.getUser(email, password);
        if (user == null) {
            request.setAttribute("error", "Tài khoản hoặc mật khẩu không chính xác!");
            request.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
