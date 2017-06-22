<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
      <head>
		<meta charset=UTF-8>
		 <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
		<title>購入完了</title>
     </head>
     <body>
     <div id="main">
     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="top"/>
     </jsp:include>
     
    	<br><br>
		<h2>購入手続きが完了しました</h2>
		<h5>ありがとうございました。</h5>	
		<h5>またのご利用お待ちしております。</h5>
	
	</div>
	<jsp:include page="page-footer.jsp"></jsp:include>
     </body>
</html>
