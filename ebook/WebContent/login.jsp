<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<c:set var="ctxPath" value="/${pageContext.servletContext.servletContextName}" scope="application" />

<!DOCTYPE html>
<html>	

     <jsp:include page="page-header.jsp">
     <jsp:param  name="page" value="login"/>
     </jsp:include>
     
	<h3>ログイン画面</h3>
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
     
     <jsp:include page="page-footer.jsp"></jsp:include>
	
	
</html>