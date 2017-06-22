package jp.co.comnic.javalesson.ebook.dao;

import javax.sql.DataSource;

public class BaseDao {

	protected DataSource ds;

	public BaseDao() throws DaoException {
		try {
			ds = DataSourceFactory.getDataSource();
		} catch (DaoException e) {
			throw new DaoException(e);
		}
	}
}