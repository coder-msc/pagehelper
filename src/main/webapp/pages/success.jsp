<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>成功了</h1>
<table cellspacing="0" cellpadding="5" border="1">
	<tr>
	<th>id</th><th>Name</th><th>DESC</th><th>STATE</th>	
	</tr>
	<c:forEach items="${info.list}" var="de">
	<tr>
		<td>${de.depId }</td>
		<td>${de.depName }</td>
		<td>${de.depDesc }</td>
		<td>${de.depState }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="4"> 
		<a href="getAllDep?pn=1">首页</a>	<a href="getAllDep?pn=${info.prePage }">上一页</a>
		  <c:forEach items="${info.navigatepageNums }" var="num">
		  <c:if test="${num==info.pageNum }">
		  【${num}】
		  </c:if>
		  <c:if test="${num !=info.pageNum }">
		  <a href="getAllDep?pn=${num }">${num }</a>
		  </c:if>
		  
		  </c:forEach>
		<a href="getAllDep?pn=${info.nextPage }">下一页</a>  <a href="getAllDep?pn=${info.pages }"></a>
		</td>
	</tr>
</table>
</body>
</html>