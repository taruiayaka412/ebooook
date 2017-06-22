package jp.co.comnic.javalesson.ebook.dao;

import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * <p></p>
 * 
 * @author M.Yoneyama
 * @version 1.0
 */
public class DataSourceFactory {

	private static InitialContext context;
	private static DataSource ds;
	
	private DataSourceFactory() {}
	
	/**
	 * <p>DataSourceを取得する。</p>
	 * 
	 * @return DataSource
	 * @throws DaoException
	 */
	public static DataSource getDataSource() throws DaoException {
		
		try {
			
			if(context == null) {
				context = new InitialContext();
			}
			
			if(ds == null) {
				ds = (DataSource)context.lookup("java:/comp/env/ds/ebook");
			}
			
		} catch (Exception e) {
			throw new DaoException(e);
		}
		
		return ds;
	}
}
