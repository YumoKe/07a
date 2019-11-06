<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<form action="list" method="post">
		影片名称：<input type="text" name="name">  上映时间<input type="date" name="startdate">-<input type="date" name="enddate"><br><br>
		导演：<input type="text" name="author"> 价格:（最低价格）<input type="text" name="minprice">-(最高价格)<input type="text" name="maxprice"><br><br>
		电影年代:<select name="year">
			<option value="">请选择年代</option>
			<option value="2019">2019</option>
			<option value="2018">2018</option>
			<option value="2017">2017</option>
			<option value="2016">2016</option>
			<option value="2015">2015</option>
			<option value="2014">2014</option>
			<option value="2013">2013</option>
		</select>  电影时长：（最短）<input type="text" name="mintime">-(最长)<input type="text" name="maxtime"><br><br>
			<input type="submit" value="查询影片">
	</form> 
</body>
</html>