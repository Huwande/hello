<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
<script type="text/javascript"></script>
<script type="text/javascript">

	function xq(t_id){
		location.href="selectId?t_id="+t_id;
	}
	function xg(t_id){
		location.href="update?t_id="+t_id;
	}
	function tj(){
		location.href="findBrand";
	}
	function ps(){
			var str="";
			$("[name='t_id']:checked").each(function(){
				str+=","+this.value;
			})
			str=str.substring(1);
			alert("删除的ID为："+str);
			
			$.ajax({
				url:"deleteAll",
				type:"post",
				data:{"t_id":str},
				success:function(data){
					if(data){
						alert("批删成功");
						location.href="select";
					}else{
						alert("批删失败");
					}
				}
			})
		}
	
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="select" method="post">
		<input type="text" name="t_name" value="${t_name}">
		<input type="submit" value="提交">
	</form>
		<input type="button" value="批删" onclick="ps()">
	<table class="table table-striped">
		<tr>
			<td>⭐⭐⭐</td>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>品牌</td>
			<td>种类</td>
			<td>尺寸</td>
			<td>单价（元）</td>
			<td>数量</td>
			<td>标签</td>
			<td>功能</td>
		</tr>
		<c:forEach items="${list}" var="hu">
		<tr>
			<td>
				<input type="checkbox" name="t_id" value="${hu.t_id}">
			</td>
			<td>${hu.t_id}</td>
			<td>${hu.t_name}</td>
			<td>${hu.t_english}</td>
			<td>${hu.bname}</td>
			<td>${hu.gname}</td>
			<td>${hu.t_size}</td>
			<td>${hu.t_price}</td>
			<td>${hu.t_number}</td>
			<td>${hu.t_shop}</td>
			<td>
				<input type="button" value="详情" onclick="xq('${hu.t_id}')">
				<input type="button" value="修改" onclick="xg('${hu.t_id}')">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
			当前${info.pageNum}/${info.pages},一共${info.total}条数据
			<a href="select?pageNum=1&name=${t_name}">首页</a>
			<a href="select?pageNum=${info.prePage}&name=${t_name}">上页</a>
			<a href="select?pageNum=${info.nextPage}&name=${t_name}">下页</a>
			<a href="select?pageNum=${info.pages}&name=${t_name}">尾页</a>
			
			</td>
		</tr>
	</table>
	<input type="button" value="添加" onclick="tj()">
</body>
</html>