<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>



    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quick Win</title>
    <%@include file="headfile.jsp" %>
</head>
<body>
    <div class="dsd-login-container dsd">
        <div class="container container-login">
            <div class="row vertical-center-row">
                <div class="els-login-wrapper">
                    <form class="login-form"
                          name="loginForm"
                          autocomplete="on"
                          action="home.jsp"
                          method="post">
                        <fieldset>
                            <input type="text"
                                   id="onevideo_login_username"
                                   name="email"
                                   placeholder="Username">
                            <input type="password"
                                   id="onevideo_login_password"
                                   name="password"
                                   placeholder="Password">
                            <button type="submit"
                                    id="onevideo_login_submit"
                                    class="btn btn-primary">
                            <span>Sign In</span>
                            </button>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>