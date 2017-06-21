<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="login"/>
     </jsp:include>
     
     <head>
          <meta charset=UTF-8>
          <title>cart</title>
     </head>
     <body>

		<h3>カート</h3>

		<table border="1">
		<tr>
			<th>本のタイトル</th>
			<th>著者</th>
			<th>発行日</th>
			<th>値段</th>
			<th>ISBN</th>
		</tr>
		</table>
		
		<br><br>
   		<a href="buy.jsp">購入画面へ</a>
		
		<jsp:include page="page-footer.jsp"></jsp:include>
     </body>
</html>