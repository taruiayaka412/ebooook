package jp.co.comnic.javalesson.ebook.dao;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * <p>部署テーブルのCRUD操作を実装するDAOクラス</p>
 * 
 * @author M.Yoneyama
 * @version 2.0
 */
public class BookDao extends BaseDao {
	
	public BookDao() throws DaoException {}


	public Book findByTitleOrAutherName(String search) throws DaoException {
		
		Book book = null;
		
		String sql = "SELECT * FROM department WHERE title like '?%' OR author_name like '?%'";
		
		try (Connection conn = ds.getConnection();
		     PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, search);
			pstmt.setString(2, search);
			
		    try (ResultSet rs = pstmt.executeQuery()) {
				
				if (rs.next()) {
					book = new Book();
				}
				
			} catch (Exception e) {
				throw new DaoException(e);
			}
		} catch (Exception e) {
			throw new DaoException(e);
		}
		
		return book;
	}
}
