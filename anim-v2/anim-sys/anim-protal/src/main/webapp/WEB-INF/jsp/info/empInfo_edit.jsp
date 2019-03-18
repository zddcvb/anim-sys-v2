<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String contextPath = request.getContextPath();
	String serverName = request.getServerName();
	int port = request.getServerPort();
	String baseUrl = "http://" + serverName + ":" + port + "/" + contextPath + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用戶信息修改</title>
<link href="<%=baseUrl%>css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
<script type="text/javascript" src="<%=baseUrl%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=baseUrl%>js/bootstrap.min.js"></script>
</head>
<body>

	<br>
	<div style="align-items: center;">
		<form action="${pageContext.request.contextPath }/emp/info/edit"
			class="form-horizontal " role="form" method="post">
			<input type="hidden" name="employeeId" value="${employee.employeeId }">
			<div class="form-group">
				<label for="passwordLabel" class="col-sm-2 control-label">密码修改</label>
				<div class="col-sm-10">
					<input type="password" name="password" placeholder="password">
				</div>
			</div>
			<div class="form-group">
				<label for="nowAddress" class="col-sm-2 control-label">现住址</label>
				<div class="col-sm-10">
					<input type="text" name="employeeNowAddress" placeholder="请输入现住址"
						value="${employee.employeeNowAddress }">
				</div>
			</div>

			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" name="submit" value="提交"
					class="btn btn-primary"> <input type="button"
					class="btn btn-primary" onclick="window.history.back(-1);"
					value="返回">
			</div>

		</form>
	</div>
</body>
</html>