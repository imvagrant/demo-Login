<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2022/6/7
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>登录</title>

    <!-- Meta-Tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- style CSS -->
    <link rel="stylesheet" href="LoginCss/css/style.css" type="text/css" media="all">

    <!-- fontawesome -->
    <link rel="stylesheet" href="LoginCss/css/font-awesome.min.css" type="text/css" media="all">

    <!-- google fonts -->
    <link href="//fonts.googleapis.com/css?family=Mukta:300,400,500" rel="stylesheet">

</head>
<!-- //Head -->

<!-- Body -->

<body>

<section class="main">
    <div class="bottom-grid">

    </div>
    <!-- register -->
    <div class="w3lhny-register" style="margin-left: 800px">
        <p class="already" >————————<span style="font-size: 25px">欢迎登陆</span>————————</p>
        <div id="errorMsg" style="color: red;font-size: 20px">${login_error}${add_msg}</div>
        <form action="loginServlet" method="post" class="register-form">
            <fieldset>
                <div class="form">
                    <div class="form-row">
                        <span class="fa fa-user"></span>

                        <input type="text" class="form-text" name="username" placeholder="Username" required="" style="border-radius:9px;">
                    </div>

                    <div class="form-row">
                        <span class="fa fa-lock"></span>
                        <input type="password" class="form-text" name="password" placeholder="Password" required="" style="border-radius:9px;">
                    </div>
                    <table>
                        <tr>
                            <td>
                                <div class="form-row button-login" >
                                    <!--          <button class="btn btn-login" >登录</button>-->
                                    <input type="submit" class="btn btn-login" value="登录">
                                </div>
                            </td>
                            <td></td>
                            <td>
                                <div class="form-row button-login" >
                                    <input type="reset" class="btn btn-login" value="重置">
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>

            </fieldset>
        </form>
        <div>
            <a href="register.jsp">
                <button class="btn btn-login" style="color: darkred;">没有账号？注册一个</button>
            </a>
        </div>


    </div>
    <!-- //register -->
    <div class="w3l-copyright">
        <p style="font-size: 20px">© 石家庄铁道大学19软件工程有限公司 |
            <a href="https://www.stdu.edu.cn/" target="_blank" style="font-size: 25px;color: blue;">学校官网</a>
        </p>
    </div>
</section>

</body>
<!-- //Body -->
</html>
