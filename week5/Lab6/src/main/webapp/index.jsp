<html>
<head>
    <meta content="text/html;" charset="UTF-8" name="viewport"/>

    <link rel="stylesheet" href="bootstrap-5.3.2-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap-5.3.2-dist/css/bootstrap-grid.min.css">
    <link rel="stylesheet" href="css/login.css">
    <title>Hello World!</title>
</head>
<body>
<div id="main">
    <div class="container">
        <div>
            Hello World!
        </div>
        <div class="success">
            <%=
            session.getAttribute("success") != null ? (String) session.getAttribute("success") : ""
            %>
        </div>
        <div class="account">
            <p class="m-0">
                <%=
                session.getAttribute("email") != null ? (String) session.getAttribute("email") : ""
                %>
            </p>
            <p class="m-0">
                <%=
                session.getAttribute("password") != null ? (String) session.getAttribute("password") : ""
                %>
            </>
        </div>
        <button class="btn bg-primary text-light">
            <a class="text-light text-decoration-none p-2 fw-bold" href="login.jsp" title="Login">Login</a>
        </button>
    </div>
</div>
</body>
</html>
