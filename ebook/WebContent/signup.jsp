<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="login"/>
     </jsp:include>
     
     
     <head>
          <meta charset=UTF-8>
          <title>sign up</title>
     </head>
  	<h3>新規登録</h3>
     	<form method="POST" action= "insert">
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
  		 	<tr>
  			  <td>
  		     	<b>username:</b>
 		      </td>
 		      <td>
  		   		<input name = "user">
  		   	  </td>
  		   </tr>
  		 </table>
     		<input type= "submit" value = "登録">
     </form>
     
      <jsp:include page="page-footer.jsp"></jsp:include>
</html>