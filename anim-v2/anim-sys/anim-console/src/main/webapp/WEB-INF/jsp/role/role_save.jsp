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
<title>Insert title here</title>
<link href="<%=baseUrl%>css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
<script type="text/javascript" src="<%=baseUrl%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=baseUrl%>js/bootstrap.min.js"></script>
</head>
<body>
	<br>
	<div>
		<form action="${pageContext.request.contextPath }/role/save_role"
			class="form-horizontal " role="form">
			<input type="hidden" name="pageNum" value="${pageNum}"
				class="form-horizontal " role="form"> <input type="hidden"
				name="roleNameQuery" value="${roleNameQuery}"> <input
				type="hidden" name="deptNameQuery" value="${deptNameQuery}">
			<div class="form-group">
				<label for="roleNaem" class="col-sm-2 control-label"> 岗位名称</label> <input
					type="text" name="roleName">
			</div>
			<div class="form-group">
				<label for="roleCreateTime" class="col-sm-2 control-label">
					岗位创建时间</label> <input type="text" name="roleCreatetime">
			</div>
			<div class="form-group">
				<label for="roleDesc" class="col-sm-2 control-label"> 岗位描述</label>
				<textarea rows="5" cols="20" name="roleDesc"></textarea>
			</div>
			<div class="form-group">
				<label for="roleDuty" class="col-sm-2 control-label"> 岗位职责</label>
				<textarea rows="5" cols="20" name="roleDuty"></textarea>
			</div>
			<div class="form-group">
				<label for="parent" class="col-sm-2 control-label"> 上级部门</label> <select
					name="deptId">
					<option value="0">请选择部门</option>
					<c:forEach items="${deptList }" var="dept">
						<option value="${dept.deptId }">${dept.deptName }</option>
					</c:forEach>
				</select>
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