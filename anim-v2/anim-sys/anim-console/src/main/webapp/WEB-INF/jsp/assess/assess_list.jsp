<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String contextPath = request.getContextPath();
	String serverName = request.getServerName();
	int port = request.getServerPort();
	String baseUrl = "http://" + serverName + ":" + port + "/" + contextPath + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>dept_list_page</title>
<link href="<%=baseUrl%>css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
<script type="text/javascript" src="<%=baseUrl%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=baseUrl%>js/bootstrap.min.js"></script>
</head>
<body>
	<br />
	<div style="margin: 10px;">
		<form action="${pageContext.request.contextPath }/assess/list"
			method="post" class="form-inline">
			<div class="form-group">
				<label for="name">姓名查询：</label> <input type="text"
					name="employeeName" placeholder="请输入姓名"
					value="${query.employeeName }">
			</div>
			<div class="form-group">
				<label for="role"> 动画名称查询：</label><input type="text" name="animName"
					placeholder="请输入岗位" value="${query.animName }">
			</div>
			<div class="form-group">
				<label for="dept">小组查询：</label><input type="text" name="animGroup"
					placeholder="请输入部门" value="${query.animGroup }">
			</div>
			<input type="submit" name="submit" value="查询">
			<div class="form-group" style="padding-right: 10px">
				<a
					href="${pageContext.request.contextPath }/assess/save?pageNum=${pageInfo.pageNum}&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}"
					class="btn btn-default btn-sm" role="button"><span>添加考核数据</span></a>
				<a href="${pageContext.request.contextPath }/assess/deleteAll"
					class="btn btn-default btn-sm" role="button"><span>删除所有考核数据</span></a>
				<a href="${pageContext.request.contextPath }/assess/batchAll"
					class="btn btn-default btn-sm" role="button"><span>批量导入考核数据</span></a>
			</div>
		</form>
	</div>
	<div>
		<form>
			<input type="hidden" name="pageNum" value="${pageNum }">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>员工姓名</th>
						<th>动画名称</th>
						<th>难易级别</th>
						<th>所在小组</th>
						<th>编辑部评分</th>
						<th>动画部评分</th>
						<th>设计部评分</th>
						<th>总评分</th>
						<th>动画总金额</th>
						<th>评估月份</th>
						<th>所在部门</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pageInfo.list}" var="assessment">
						<tr>
							<td><a
								href="
							${pageContext.request.contextPath }/assess/view/${assessment.assessId}?pageNum=${pageInfo.pageNum}&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}">${assessment.employeeName }</a></td>
							<td>${assessment.animName }</td>
							<td>${assessment.animLevel }</td>
							<td>${assessment.animGroup }</td>
							<td>${assessment.editorAssessmentScore }</td>
							<td>${assessment.animatorAssessemtScore }</td>
							<td>${assessment.designerAssessmentScore }</td>
							<td>${assessment.animRole.animTotalScore }</td>
							<td>${assessment.animDept.animTotalMoney}</td>
							<td>${assessment.assessmentMonth}</td>
							<td>${assessment.deptName}</td>
							<td><a
								href="${pageContext.request.contextPath }/assess/edit/${assessment.assessId }?pageNum=${pageInfo.pageNum}&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}">修改</a>
								<a
								href="${pageContext.request.contextPath }/assess/delete/${assessment.assessId }?pageNum=${pageInfo.pageNum}&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}">删除</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!-- 分页功能 -->
			<div style="margin: 10px;">
				<span> <a class="btn btn-default btn-sm"
					href="${pageContext.request.contextPath }/assess/list?pageNum=1&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}">首页</a></span>
				<span><a class="btn btn-default btn-sm"
					href="${pageContext.request.contextPath }/assess/list?pageNum=${pageInfo.prePage}&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}">上一页</a></span>
				<c:forEach begin="1" end="${pageInfo.pages }" step="1" var="num">
					<span><a
						href="${pageContext.request.contextPath }/assess/list?pageNum=${num}&employeeName=${employeeName}&animName=${animName }&animGroup=${animGroup}">
							<c:choose>
								<c:when test="${pageInfo.pageNum==num}">
									<span><u>${num }</u></span>
								</c:when>
								<c:otherwise>
									<span>${num }</span>
								</c:otherwise>
							</c:choose>
					</a></span>
				</c:forEach>
				<select id="page" name="pageNum" onchange="changed()"
					class="btn btn-default btn-sm">
					<option selected>${pageInfo.pageNum }</option>
					<c:forEach begin="1" end="${pageInfo.pages }" step="1" var="num">
						<c:if test="${pageInfo.pageNum!=num }">
							<option value="${num }">${num}</option>
						</c:if>
					</c:forEach>
				</select> <span><a class="btn btn-default btn-sm"
					href="${pageContext.request.contextPath }/assess/list?pageNum=${pageInfo.nextPage}&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}">下一页</a></span>
				<span><a class="btn btn-default btn-sm"
					href="${pageContext.request.contextPath }/assess/list?pageNum=${pageInfo.lastPage}&employeeName=${query.employeeName}&animName=${query.animName }&animGroup=${query.animGroup}">尾页</a></span>
			</div>
			<br />
		</form>
	</div>
</body>
<script type="text/javascript">
	function changed() {
		var select = document.getElementById("page");
		var value = select.value;
		value.selected = true;
		var serverName = "${pageContext.request.serverName}";
		var serverPort = "${pageContext.request.serverPort}";
		var contextPath = "${pageContext.request.contextPath }";
		window.location.href = "http://"
				+ serverName
				+ ":"
				+ serverPort
				+ "/"
				+ contextPath
				+ "/assess/list?pageNum="
				+ value
				+ "&employeeName=${employeeName}&animName=${animName }&animGroup=${animGroup}";
	}
</script>
</html>