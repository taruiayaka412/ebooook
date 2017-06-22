<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
     <head>
          <meta charset=UTF-8>
          <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
          <title>search_result</title>
     </head>
     <body>
          <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="top"/>
     </jsp:include>
     
     <h3>検索結果</h3>
	<table border="1">
		<tr>
			<th>本のタイトル</th>
			<th>著者</th>
			<th>発行日</th>
			<th>値段</th>
			<th>ISBN</th>
		</tr>
		</table>
     </body>
     
     
</html>