<%--
  Created by IntelliJ IDEA.
  User: Tu
  Date: 10/30/2023
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
    <link rel="shortcut icon" type="image/icon" href="assets/logo/favicon.png"/>
    <link rel="stylesheet" href="bootstrap-5.3.2-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap-5.3.2-dist/css/bootstrap-grid.min.css">
    <title>Register</title>
</head>
<body>
<div class="main">
    <!-- Sign up form -->
    <section class="signup">
        <div class="container">
            <div class="signup-content">
                <div class="signup-form">
                    <h2 class="form-title">Sign up</h2>
                    <form method="POST" action="Register">
                        <div class="form-group">
                            <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                            <input type="text" name="name" id="name" placeholder="Your Name" required/>
                        </div>
                        <div class="form-group">
                            <label for="sex"><i class="zmdi zmdi-male-female"></i></label>
                            <select name="sex" id="sex"
                                    class="w-100 border-start-0 border-end-0 border-top-0 ps-4 text-secondary">
                                <option value="nam">Nam</option>
                                <option value="nữ">Nữ</option>
                                <option value="khác">Khác</option>
                            </select>
                        </div>
                        <div class="form-group  mb-1">
                            <label for="email"><i class="zmdi zmdi-email"></i></label>
                            <input type="text" name="email" id="email" placeholder="Your Email" required/>
                        </div>
                        <p class="text-danger">
                            <%= request.getAttribute("errorFormEmail") != null ? request.getAttribute("errorFormEmail") : ""%>
                        </p>
                        <div class="form-group">
                            <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                            <input type="password" name="pass" id="pass" placeholder="Password" required/>
                        </div>
                        <div class="form-group mb-1">
                            <label for="re_pass"><i class="zmdi zmdi-lock-outline"></i></label>
                            <input type="password" name="re_pass" id="re_pass" placeholder="Repeat your password"
                                   required/>
                        </div>
                        <p class="text-danger">
                            <%=request.getAttribute("errorRePass") != null ? request.getAttribute("errorRePass") : "" %>
                        </p>
                        <div class="form-group">
                            <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" required/>
                            <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all
                                statements in <a href="#" class="term-service">Terms of service</a></label>
                        </div>
                        <div class="form-group">
                            <button class="btn w-50 text-white bg-primary mb-5" type="submit">Register</button>
                        </div>
                    </form>
                </div>
                <div class="signup-image text-center btn">
                    <figure><img src="img/signup-image.jpg" alt="sing up image"></figure>
                    <a href="login.jsp" style="color: #000; text-decoration: none; font-size: 20px">I am already
                        member</a>
                </div>
            </div>
        </div>
    </section>

</div>

<!-- JS -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>
