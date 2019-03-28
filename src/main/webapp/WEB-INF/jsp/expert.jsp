<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itcast" uri="http://snake8859.top/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>卫健专家管理平台</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="css/metisMenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link href="css/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="css/boot-crm.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/expert">卫健专家管理平台v1.0</a>
		</div>
		
		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<!-- <li><a href="expert" class="active"><i
							class="fa fa-edit fa-fw"></i>鉴定管理</a></li> -->
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side --> </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">远程鉴定管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>上传时间</th>
									<th>用户昵称</th>
									<th>鉴定类型</th>
									<th>鉴定图片</th>
									<th>用户说明</th>
									<th>用户位置</th>
									<th>专家意见</th>
									<th>操作</th>
								</tr>
							</thead>
							<%-- 
							<tbody>
									<tr>
										<td>1</td>
										<td>植物鉴定</td>
										<td>质坚皮薄，叶长椭圆形面端尖，对生，经冬不凋。花生叶腑间，花冠合瓣四裂，形小。</td>
										<td>
											<img src="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3957852892,3283296746&fm=26&gp=0.jpg" style="width: 150px;height: 150px" alt="" />
											<img src="https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4042165394,2633891778&fm=26&gp=0.jpg" style="width: 150px;height: 150px" alt="" />
										</td>
										<td>snake8859</td>
										<td>
											<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#forestEditDialog" onclick="editCustomer(${row.id})">专家回复</a>
										</td>
									</tr> 
							</tbody> 
							--%>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<tr>
										<td>${row.createtime}</td>
										
										<td>${row.nickname}</td>
										<td>
											<c:if test="${row.taid==1}">
												植物鉴定
											</c:if>
											<c:if test="${row.taid==2}">
												害虫鉴定
											</c:if>
											<c:if test="${row.taid==3}">
												媒介鉴定
											</c:if>
											<c:if test="${row.taid==4}">
												其他鉴定
											</c:if>
											<c:if test="${row.taid==5}">
												用户未选定任何类型
											</c:if>
										</td>
										<td>
										<c:set value="${row.picList }" var="authPic"></c:set>
												<c:forEach items="${authPic }" var="pic">
													<img src="${pic.picname}" style="width: 150px;height: 150px" alt="" title=""  />
												</c:forEach>
										</td>
										<td>${row.content}</td>
										<td>${row.address}</td>
										<td>${row.expertreply}</td>
										<td>
											<c:if test="${row.replystate==0 }">
												<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#forestEditDialog" onclick="editAuth('${row.uaid}')">专家回复</a>
											</c:if>
											<c:if test="${row.replystate==1 }">
												<button type="button" class="btn" data-toggle="modal" data-target="#forestEditDialog" onclick="editAuth('${row.uaid}')">专家已回复</button>
												<%-- <br></br>
												<p class="text-primary">回复内容：<br/>${row.expertreply }</p> --%>
											</c:if>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itcast:page url="${pageContext.request.contextPath }/expert" />
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- 编辑对话框 -->
	<div class="modal fade" id="forestEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">专家回复</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_forest_form">
						<input type="hidden" id="uaid" name="uaid"/>
						<div class="form-group">
							<label for="" class="col-sm-2 control-label">回复内容</label>
							<div class="col-sm-10">
								<!-- <input type="text" class="form-control" id="" placeholder="您的回复" name=""> -->
								<textarea class="form-control" rows="3"  id="expertreply" placeholder="您的回复" name="expertreply"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="" class="col-sm-2 control-label">修改者</label>
							<div class="col-sm-10">
							<%
								String username=(String)session.getAttribute("username"); //获取保存在session范围内的用户名
							%>
								<input type="text" class="form-control" id="mender" placeholder="修改者" name="mender" value="<%=username%>">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="updateAuth()">保存</button>
				</div>
			</div>
		</div>
	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="js/sb-admin-2.js"></script>
	
	<script type="text/javascript">
		function editAuth(id) {
			//console.log(id);
			$("#uaid").val(id);
			<%-- var params = '{"id": '+'"'+id+'"'+'}';
			$.ajax({
				type:"post",
				url:"forest/queryForestInformation.action",
				data:params,
				contentType : "application/json;charset=UTF-8",
				dataType : "json",//回调
				success:function(data) {
					$("#fid").val(data.fid);
					$("#fName").val(data.fName);
					$("#fType").val(data.fType)
					$("#fForm").val(data.fForm)
					$("#fOrigin").val(data.fOrigin)
					$("#fGrowthHabit").val(data.fGrowthHabit);
				}
			}); --%>
		}
		function updateAuth() {
		$.post("https://wxx.xmwjyy.com/user/updateAuth",$("#edit_forest_form").serialize(),function(data){
		<%-- $.post("<%=basePath%>user/updateAuth",$("#edit_forest_form").serialize(),function(data){ --%>
				console.log(data);
				if(data.msg=="success"){
					alert("专家回复成功！");
				}
				if(data.msg=="fail"){
					alert("专家回复失败！");
				}
				if(data.msg=="fail_null"){
					alert("专家回复内容不能为空");
				}
				window.location.reload();
			});
		}
		
		<%-- function deleteForest(id) {
			if(confirm('确实要删除该资源吗?')) {
				$.post("",{"id":id},function(data){
					alert("资源删除更新成功！");
					window.location.reload();
				});
			}
		} --%>
	</script>

</body>

</html>
