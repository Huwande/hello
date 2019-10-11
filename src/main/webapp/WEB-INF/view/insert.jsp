<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>>
<!DOCTYPE html>
<html>
<head>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function tj(){
		$.post("add",$("form").serialize(),function(obj){
			if(obj){
				alert("添加成功");
				location.href="select";
			}
		})
	}
</script>
<meta charset="UTF-8">
<title>商品新增表</title>
</head>
<body>
	<form action="">
		<table>
			<tr><td>商品名称：<input type="text" name="t_name"></td></tr>
			<tr><td>英文名称：<input type="text" name="t_english"></td></tr>
			<tr><td>品牌：<select id="t_bid" name="tb_brand.t_bname">
							<c:forEach items="${brands}" var="b" >
										<option>
											${b.t_bname }
										</option>
							</c:forEach>
						</select>
			<tr><td>种类：<select id="t_gid" name="tb_goodskind.t_gname">
							<c:forEach items="${kind}" var="g" >
										<option>
											${g.t_gname }
										</option>
							</c:forEach>
						</select>

			<tr><td>尺寸：<input type="text" name="t_size"></td></tr>
			<tr><td>单价（元）：<input type="text" name="t_price"></td></tr>
			<tr><td>数量：<input type="text" name="t_number"></td></tr>
			<tr><td>标签：<input type="text" name="t_shop"></td></tr>
			<tr><td>标签：<input type="button" value="添加" onclick="tj()"></td></tr>
		</table>
	</form>
</body>
</html>