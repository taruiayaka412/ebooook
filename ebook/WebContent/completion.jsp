<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
     <head>
          <meta charset=UTF-8>
          <title>Insert title here</title>
     </head>
     <body>
     
     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="top"/>
     </jsp:include>
     
    	<br><br>
		<h2>購入手続きが完了しました</h2>
		<h5>ありがとうございました。</h5>	
		<h5>またのご利用お待ちしております。</h5>
	
	<jsp:include page="page-footer.jsp"></jsp:include>
     </body>
</html>
