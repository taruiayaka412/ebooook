<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<jsp:include page="page-header.jsp">
	<jsp:param  name="page" value="login"/>
	</jsp:include>
	
	<h3>購入画面</h3>
	<table>
	<tr>
	<th>
	<a href="completion.jsp"><input type= "submit" value = "買います"></a>
	</th>
	<th>
	<a href="cart.jsp"><input type= "submit" value = "買いません"></a>
	</th>
	</tr>
	</table>
	<jsp:include page="page-footer.jsp"></jsp:include>
</html>