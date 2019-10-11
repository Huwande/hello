<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>>
<!DOCTYPE html>
<html>
<head>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function xg(){
		alert("修改成功");
		location.href="select";
	}
</script>
</head>
<body>
	<form>
		<table>
			<c:forEach items="${hu}" var="hu">
			<tr><td>商品编号：<input type="text" name="t_id" value="${hu.t_id}"></td></tr>
			<tr><td>商品名称：<input type="text" name="t_name" value="${hu.t_name}"></td></tr>
			<tr><td>英文名称：<input type="text" name="t_english" value="${hu.t_english}"></td></tr>
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

			<tr><td>尺寸：<input type="text" name="t_size" value="${hu.t_size}"></td></tr>
			<tr><td>单价（元）：<input type="text" name="t_price" value="${hu.t_price}"></td></tr>
			<tr><td>数量：<input type="text" name="t_number"  value="${hu.t_number}"></td></tr>
			<tr><td>标签：<input type="text" name="t_shop"  value="${hu.t_shop}"></td></tr>
			<tr><td>标签：<input type="button" value="修改" onclick="xg()"></td></tr>
				</c:forEach>
		</table>
	</form>
</body>
</html>