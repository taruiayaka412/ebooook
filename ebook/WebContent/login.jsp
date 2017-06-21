<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>	
 	<head>
		<meta charset=UTF-8>
		 <link rel="stylesheet" type="text/css" href="css/stylesheet.css">
		<title>login</title>
     </head>

	<body>
	<div id="main">
     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="login"/>
     </jsp:include>
     
     <h3>ログイン</h3>
     	<form method="POST" action= "login">
   		  <table>
  		   <tr>
  			  <td>
  		     	<b>email:</b>
 		      </td>
 		      <td>
  		   		<input name = "email">
  		   	  </td>
  		   </tr>
  		   <tr>
  		   	  <td>
  		   		<b>pass:</b>
  		   	  </td>
    	 	  <td>
  		 		<input type ="password" name = "pass">
  		 	  </td>
  		 	</tr>
  		 </table>
     		<input type= "submit" value = "ログイン">
     </form>
     
     <br><br>
     <a href="signup.jsp">新規登録</a>
     
      </div>
     <jsp:include page="page-footer.jsp"></jsp:include>
 
	</body>
	
</html>