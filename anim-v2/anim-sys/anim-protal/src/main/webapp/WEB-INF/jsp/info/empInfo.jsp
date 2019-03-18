<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String contextPath = request.getContextPath();
	String serverName = request.getServerName();
	int port = request.getServerPort();
	String baseUrl = "http://" + serverName + ":" + port + "/" + contextPath + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="<%=baseUrl%>css/bootstrap.min.css" type="text/css"
	rel="stylesheet">

<script type="text/javascript" src="<%=baseUrl%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=baseUrl%>js/bootstrap.min.js"></script>
</head>
<body>
	<div style="margin-left: 180px; margin-top: 20px;">
		<h4>
			<b>个人信息</b>
		</h4>
	</div>
	<hr>
	<div align="center">
		<table class="table table-bordered"
			style="width: 80%; font-size: 15px;">
			<tbody align="center" style="margin-top: 20px;">
				<tr height="50px">
					<td width="15%"><b>姓名：</td>
					<td width="20%">${employee.employeeName }</td>
					<td width="15%"><b>性别：</td>
					<td width="20%">${employee.employeeSex }</td>
					<td rowspan="8" width="30%" align="center"><img
						src="<%=baseUrl%>img/icon.jpg" width="70%"
						style="margin-top: 50px"></td>
				</tr>
				<tr>
					<td><b>年龄：</b></td>
					<td>${employee.employeeAge }</td>
					<td><b>入职日期：</b></td>
					<td>${employee.employeeBorn }</td>
				</tr>
				<tr>
					<td><b>毕业院校：</b></td>
					<td>${employee.employeeSchool }</td>
					<td><b>所学专业：</b></td>
					<td>${employee.employeeMajor }</td>
				</tr>
				<tr>
					<td><b>最高学历：</b></td>
					<td>${employee.employeeEducation }</td>
					<td><b>所属部门：</b></td>
					<td>${employee.animDept.deptName }</td>
				</tr>
				<tr>
					<td><b>现有岗位：</b></td>
					<td>${employee.animRole.roleName }</td>
					<td><b>电话号码：</b></td>
					<td>${employee.employeeTelephone }</td>
				</tr>
				<tr>
					<td><b>微信号：</b></td>
					<td>${employee.employeeWechant }</td>
					<td><b>QQ号：</b></td>
					<td>${employee.employeeQq }</td>
				</tr>
				<tr>
					<td><b>广州现住址：</b></td>
					<td colspan="3">${employee.employeeNowAddress }</td>
				</tr>
				<tr>
					<td colspan="4"><a class="btn btn-default btn-md"
						href="${pageContext.request.contextPath }/emp/info/${employee.employeeId}">个人信息修改</a></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>