<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>卫健专家管理平台</title>
<!-- CSS -->
<link rel="stylesheet" href="css/index.css" />
<!-- jQuery -->
<script src="js/jquery.min.js"></script>
</head>

<body>
<img src="img/login_logo.png" class="login_logo"/>

<div class="content">
	<div class="bidTitle">卫健专家管理平台登录</div>
	<div class="logCon">
	 <form id="userInfo">
		<div class="line"><span>账号:</span>
		<input class="bt_input" type="text" id="username" name="username" /></div>
		<div class="line"><span>密码:</span>
		<input class="bt_input" type="password" id="password" name="password" /></div>
	</form>
		<button class="logingBut" onclick="login()" value="登录">登录</button>
	</div>
</div>


<script type="text/javascript">
function login() {
	var username = $("#username").val();
	var password = $("#password").val();
	//alert(username+password);
	/* {"username": "xxx","password":"xxx"} */
	var params = '{"username": '+'"'+username+'"'+","+'"password":'+'"'+password+'"'+'}';
	//alert(params);  
	if(username!="" && password!=""){
		$.ajax({
			type:"post",
			url:"https://wxx.xmwjyy.com/user/login",
			data:params,
			contentType : "application/json;charset=UTF-8",
			dataType : "json",//回调
			success:function(data) {
				console.log(data);
				if(data.msg=="fail"){
					alert("账号或者密码错误");
				}
				if(data.msg=="success"){
					window.location.href = "expert";
				}
			}
		});
	}
	else{
		alert("用户名或者密码不能为空");
	}
}
</script>

</body>

</html>