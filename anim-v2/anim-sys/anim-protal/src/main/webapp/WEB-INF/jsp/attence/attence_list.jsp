<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工考勤查询</title>
<link href="<%=baseUrl%>css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
<link href="<%=baseUrl%>css/bootstrap-datetimepicker.css"
	type="text/css" rel="stylesheet">
<link href="<%=baseUrl%>css/bootstrap-datetimepicker.min.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript" src="<%=baseUrl%>js/jquery-3.3.1.min.js"></script>

<script type="text/javascript" src="<%=baseUrl%>js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="<%=baseUrl%>js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#datetimepicker,#datetimepicker2').datetimepicker({
			format : 'yyyy-mm-dd',
			autoClose : true,
			minView : 2,
			language : 'zh'
		});
	})
</script>

</head>
<body>
	<br />
	<div style="margin: 10px;">
		<form
			action="${pageContext.request.contextPath }/attence/list?username=${username }"
			method="post" class="form-inline">
			<div class="form-group">
				<label for="res">起始日期：</label><input type="text" name="startDate"
					placeholder="请输入起始日期" value="" id="datetimepicker">
			</div>
			<div class="form-group">
				<label for="rescata">截止日期：</label><input type="text" name="endDate"
					placeholder="请输入截止日期" value="" id="datetimepicker2">
			</div>
			<div class="form-group">
				<input type="submit" name="submit" value="查询">
			</div>
		</form>
	</div>
	<div>
		<form>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>打卡日期</th>
						<th>上班打卡</th>
						<th>打卡状态</th>
						<th>下班打卡</th>
						<th>打卡状态</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${attences}" var="attence">
						<tr>
							<td>${attence.attenceDate }</td>
							<td>${attence.attenceStart }</td>
							<td>${attence.startStatus }</td>
							<td>${attence.attenceEnd }</td>
							<td>${attence.endStatus }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</form>
	</div>
</body>
</html>