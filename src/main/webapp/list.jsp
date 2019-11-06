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
	<input type="button" value="查询影片" onclick="sel()">
	<input type="button" value="批量删除" onclick="del()">
	<input type="button" value="全选/全不选" id="qx">
	<input type="button" value="反选" onclick="fx()">
	<table>
		<thead>
			<tr>
				<th>选择</th>
				<th>影片名</th>
				<th>导演</th>
				<th>票价</th>
				<th id="date" onclick="date()">
				上映时间
				<input type="hidden" value="${(su.sor).contains('asc')?1:0  }" name="date"></th>
				<th id="time" onclick="time()">时长<input type="hidden" value="${(su.sor).contains('asc')?1:0  }" name="time"></th>
				<th>类型</th>
				<th id="year" onclick="year()">年代<input type="hidden" value="${(su.sor).contains('asc')?1:0  }" name="year"></th>
				<th>区域</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.list }" var="m">
				<tr>
					<td><input type="checkbox" name="id" value="${m.id }"></td>
					<td>${m.name }</td>
					<td>${m.author }</td>
					<td>${m.price }</td>
					<td>${m.datetime }</td>
					<td>${m.time }</td>
					<td>${m.type }</td>
					<td>${m.year }</td>
					<td>${m.ope }</td>
					<td>${m.note == 1?'正在热播':'已经下架' }
					</td>
					<td><input type="button" value="${m.note == 1?'下架':'上架'  }" onclick="buy('${m.id}','${m.note}')"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<input type="button" value="首页" onclick="page(1)">
	<input type="button" value="上一页" onclick="page('${page.pageNum - 1 < 1 ? page.pageNum:page.pageNum - 1}')">
	<input type="button" value="下一页" onclick="page('${page.pageNum + 1 > page.pages ? page.pageNum:page.pageNum + 1}')">
	<input type="button" value="尾页" onclick="page('${page.pages}')">
</body>
<script type="text/javascript">

	$("#qx").toggle(function(){
		$("[name=id]").attr("checked",true)
	},function(){
		$("[name=id]").attr("checked",false)
	});
	
	function fx(){
		$("[name=id]").each(function(){
			this.checked = !this.checked;
		})
	}

	function page(pageNum){
		location = "list?pageNum="+pageNum;
	}
	
	function del() {
		var id = $("[name=id]:checked").map(function(){
			return $(this).val();
		}).get().join(",");
		location = "delete?id="+id 
	}
	
	function buy(id,note){
		if (note == 1) {
			location = "buy?note=0&id="+id;
		} else {
			location = "buy?note=1&id="+id;
		}
	}
	
	function sel() {
		location = "sel.jsp";
	}
	
	function year(){
		if ($("[name=year]").val() == 0) {
			location = "list?sort=year asc";
		}else{
			location = "list?sort=year desc";
		}
	}
	
	function time(){
		if ($("[name=time]").val() == 0) {
			location = "list?sort=time asc";
		}else{
			location = "list?sort=time desc";
		}
	}
	
	function date(){
		if ($("[name=date]").val() == 0) {
			location = "list?sort=datetime asc";
		}else{
			location = "list?sort=datetime desc";
		}
	}
</script>
</html>