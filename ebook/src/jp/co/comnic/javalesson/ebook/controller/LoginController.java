package jp.co.comnic.javalesson.ebook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.javalesson.ebook.dao.AccountDao;
import jp.co.comnic.javalesson.ebook.dao.DaoException;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		try {
			String url = new AccountDao().login(email, pass);
			request.getRequestDispatcher(url)
			.forward(request, response);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
	}

}
