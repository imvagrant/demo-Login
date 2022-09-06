<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2022/6/7
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<!-- Head -->

<head>

  <title>欢迎注册</title>

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
    <p class="already" >————————<span style="font-size: 25px">欢迎注册</span>————————</p>
    <p><span style="color: black">已有账号？</span><a href="Login.html" style="color:skyblue;">点击登录</a></p>
    <form action="RegisterServlet" method="post" class="register-form">
      <fieldset>
        <div class="form">
          <div  style="color: red;font-size: 20px">${username_error}</div>
          <div class="form-row">
            <span class="fa fa-user"></span>

            <input type="text" class="form-text" name="username"
                   placeholder="Username" required="" style="border-radius:9px;">
          </div>

          <div class="form-row">
            <span class="fa fa-lock"></span>

            <input type="password" class="form-text" name="password"
                   placeholder="Password" required="" style="border-radius:9px;">
          </div>
          <div class="form-row">
            <span class="fa fa-lock"></span>

            <input type="password" class="form-text" name="confirm_password"
                   placeholder="Confirm" required="" style="border-radius:9px;">
          </div>
          <div id="errorMsg" style="color: red;font-size: 20px">${password_error}</div>
          <div class="form-row button-login">
            <table style="text-align: center">
              <tr>
                <td><button class="btn btn-login" style="color: orange">确认注册</button></td>
                <td><button class="btn btn-login" type="reset">重置</button></td>
              </tr></table>
          </div>
        </div>
      </fieldset>
    </form>


  </div>
  <!-- //register -->
  <div class="w3l-copyright">
    <p style="font-size: 20px">© 石家庄铁道大学软件工程有限公司 |
      <a href="https://www.stdu.edu.cn/" target="_blank" style="font-size: 25px;color: blue;">学校官网</a>
    </p>
  </div>
</section>

</body>
<!-- //Body -->
</html>
