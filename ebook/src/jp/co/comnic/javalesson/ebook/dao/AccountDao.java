package jp.co.comnic.javalesson.ebook.dao;


import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jp.co.comnic.javalesson.ebook.entity.Account;

public class AccountDao extends BaseDao{

	public AccountDao() throws DaoException {}
	
public String login(String email, String pass) throws DaoException {
	
	String url = null;
	
	/*
	String sql = "SELECT * FROM account WHERE email = ? AND password = ?";
		
		try (Connection conn = ds.getConnection();
		     PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, email);
			pstmt.setString(2, pass);
			
		    try (ResultSet rs = pstmt.executeQuery()) {
		    	
//		    	System.out.println(rs);
		    	
//		try (Connection conn = ds.getConnection();
//				 Statement stmt = conn.createStatement();
//				 ResultSet rs = stmt.executeQuery(sql)) {
		    	
		    	if(rs.next() == true){
		    		url = "/index.jsp";
		    	} else {
		    		url = "/error.jsp";
		    	}
				
			} catch (Exception ex) {
				throw new DaoException(ex);
			}
		} catch (Exception ex) {
			throw new DaoException(ex);
		}
		
		*/
	
	try (Connection conn = ds.getConnection()){
		
		EntityManager em = Persistence.createEntityManagerFactory("ebook").createEntityManager();
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Account> criteria = builder.createQuery(Account.class);
		Root<Account> account = criteria.from(Account.class);
			
		criteria.select(account)
	    .where(builder.equal(account.get("email"), email),
	    builder.equal(account.get("password"), pass));
		
		TypedQuery<Account> query = em.createQuery(criteria);
		List<Account> list = query.getResultList();
		
    	if(list.isEmpty()){
    		url = "/error.jsp";
    	} else {
    		url = "/success.jsp";
    	}
		
	}catch (Exception ex) {
		throw new DaoException(ex);
	}
		return url;
	}
}
