<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
 <head>
		<meta charset=UTF-8>
		 <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
		<title>success</title>
     </head>
     
     <body>
     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="login"/>
     </jsp:include>
     
     <h1>ログイン成功</h1>
     <a href="login.jsp">ログイン画面へ戻る</a>
     </body>
     
     <jsp:include page="page-footer.jsp"></jsp:include>
</html>