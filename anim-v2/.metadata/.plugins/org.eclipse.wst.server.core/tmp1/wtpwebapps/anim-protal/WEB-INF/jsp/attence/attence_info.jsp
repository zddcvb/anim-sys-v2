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
<title>员工考勤</title>
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
<%-- <script type="text/javascript"
	src="<%=baseUrl%>js/bootstrap-datetimepicker.min.js"></script> --%>

<script type="text/javascript">
	$(document).ready(function() {
		$('#datetimepicker,#datetimepicker2').datetimepicker({
			format : 'yyyy-mm-dd',
			autoClose : true,
			minView : 2,
			language : 'zh'
		});
	})
	var id_down;
	var id_up;
	var year;
	var month;
	var day;
	var hour;
	var minutes;
	var second;
	var time;
	var week;
	var hms;
	window.onload = function() {
		timer_today();
		if (id_down == null) {
			timer_down();
		}
		if (id_up == null) {
			timer_up();
		}
	}
	function timer_today() {
		//定时器每秒调用一次fnDate()
		setInterval(function() {
			fnDate_today();
		}, 1000);
	}
	function timer_down() {
		//定时器每秒调用一次fnDate()
		id_down = setInterval(function() {
			fnDate_down();
		}, 1000);
	}
	function timer_up() {
		//定时器每秒调用一次fnDate()
		id_up = setInterval(function() {
			fnDate_up();
		}, 1000);
	}
	function cleartimer(id) {
		//定时器每秒调用一次fnDate()
		clearInterval(id);
	}

	function getTime() {
		var date = new Date();
		year = date.getFullYear();
		month = date.getMonth();
		day = date.getDate();
		hour = date.getHours();
		minutes = date.getMinutes();
		second = date.getSeconds();
		time = year + "年" + addZero(month + 1) + "月" + day + "日";
		weeks = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
		week = new Date().getDay();
		week = weeks[week];
		hms = addZero(hour) + ":" + addZero(minutes) + ":" + addZero(second);
	}
	function fnDate_today() {
		getTime();
		var today = document.getElementById("today");
		today.innerHTML = time + " " + week + " " + hms;
	}
	function fnDate_down() {
		var time_down = document.getElementById("time_down");
		time_down.innerHTML = hms;
	}
	function fnDate_up() {
		var time_up = document.getElementById("time_up");
		time_up.innerHTML = hms;
	}
	function addZero(str) {
		return str > 9 ? str : '0' + str;
	}

	function attence_down() {
		var time_down_click = document.getElementById("time_down_click");
		var value = time_down_click.innerHTML;
		alert(value);
		if (value == "考勤") {
			time_down_click.innerHTML = hms;
		}
		alert(id_down);
		cleartimer(id_down);

	}
	function attence_up() {
		var time_up_click = document.getElementById("time_up_click");
		var value = time_up_click.innerHTML;
		alert(value);
		if (value == "考勤") {
			time_up_click.innerHTML = hms;
		}
		alert(id_up);
		cleartimer(id_up);
	}
</script>
</head>
<body>
	<div>
		<div style="margin-top: 10px; margin-left: 10px;">
			<div>
				<span style="font-size: 20px;"><b>上班考勤 </b></span><span id="today"></span>
			</div>
			<div>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>时段</th>
							<th>打卡</th>
							<th>状态</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>上班打卡</td>
							<td><a
								href="${pageContext.request.contextPath }/attence/edit?attenceType=1&username=${username}"
								target="right"> <c:choose>
										<c:when test="${attence.attenceStart!=null }">
										${attence.attenceStart}
									</c:when>
										<c:otherwise>考勤</c:otherwise>
									</c:choose>
							</a></td>
							<td><span id="time_up_status"><c:choose>
										<c:when test="${attence.startStatus=='0'}">
										正常
									</c:when>
										<c:when test="${attence.startStatus=='1'}">
										迟到
									</c:when>
										<c:otherwise>早退</c:otherwise>
									</c:choose></span></td>
						</tr>
						<tr >
							<td>下班打卡</td>
							<td><a
								href="${pageContext.request.contextPath }/attence/edit?attenceType=2&username=${username}"
								target="right"><span> <c:choose>
											<c:when test="${attence.attenceEnd!=null }">
										${attence.attenceEnd}
									</c:when>
											<c:otherwise>考勤</c:otherwise>
										</c:choose>
								</span></a></td>
							<td><span id="time_down_status"> <c:choose>
										<c:when test="${attence.endStatus=='0'}">
										正常
									</c:when>
										<c:when test="${attence.endStatus=='1'}">
										迟到
									</c:when>
										<c:otherwise>早退</c:otherwise>
									</c:choose>
							</span></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div>
				<span style="font-size: 20px;"><b>考勤查詢</b></span>
			</div>
			<div align="center">
				<form
					action="${pageContext.request.contextPath }/attence/list?username=${username}"
					method="post" class="form-inline" role="form">
					<div class="form-group">
						<label for="start">起始日期： </label> <input type="text"
							name="startDate" class="input-append date"  placeholder="请输入起始日期"
							id="datetimepicker">
					</div>
					<div class="form-group">
						<label for="end">结束日期： </label> <input type="text" name="endDate"
							class="input-append date" placeholder="请输入截止日期" id="datetimepicker2"> <input
							type="submit" value="查询">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>