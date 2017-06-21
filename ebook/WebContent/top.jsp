<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
     <head>
          <meta charset=UTF-8>
          <title>top</title>
     </head>
     <body>

     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="top"/>
     </jsp:include>
	
	<br><br>
	<table border="1">
		<tr>
			<th>本のタイトル</th>
			<th>著者</th>
			<th>発行日</th>
			<th>値段</th>
			<th>ISBN</th>
		</tr>
		<tr>
			<td>Javabook</td>
			<td>tamaki</td>
			<td>2017/06/20</td>
			<td>3,000円</td>
			<td>1234567890</td>
		</tr>
			<tr>
			<td>SQLbook</td>
			<td>takashi</td>
			<td>2017/05/20</td>
			<td>2,800円</td>
			<td>12345667892</td>
		</tr>
			<tr>
			<td>HTMLbook</td>
			<td>tarui</td>
			<td>2017/04/20</td>
			<td>4,000円</td>
			<td>1234567892</td>
		</tr>
		</table>
	<jsp:include page="page-footer.jsp"></jsp:include>
     </body>
</html>