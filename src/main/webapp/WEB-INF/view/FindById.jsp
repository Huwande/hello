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
	function fh(){
		location.href="select";
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<c:forEach items="${hu}" var="hu">
		<tr>
			<td>商品编号<br>
			${hu.t_id}
			</td>
			<td>商品名称<br>
			${hu.t_name}
			</td>
			<td>英文名称<br>
			${hu.t_english}
			</td>
			<td>品牌<br>
			${hu.bname}
			</td>
			<td>种类<br>
			${hu.gname}
			</td>
			<td>尺寸<br>
			${hu.t_size}
			</td>
			<td>单价（元）<br>
			${hu.t_price}
			</td>
			<td>数量<br>
			${hu.t_number}
			</td>
			<td>标签<br>
			${hu.t_shop}
			</td>
		</tr>
		</c:forEach>
				<input type="button" value="返回" onclick="fh()">
	</table>
</body>
</html>