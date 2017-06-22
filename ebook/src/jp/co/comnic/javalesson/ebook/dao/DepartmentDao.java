package jp.co.comnic.javalesson.ebook.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jp.co.comnic.javalesson.ebook.entity.Department;

/**
 * <p>部署テーブルのCRUD操作を実装するDAOクラス</p>
 * 
 * @author M.Yoneyama
 * @version 2.0
 */
public class DepartmentDao extends BaseDao {
	
	public DepartmentDao() throws DaoException {}
	private CriteriaQuery<Department> query = builder.createQuery(Department.class);
	private Root<Department> root = query.from(Department.class);
	
	public List<Department> findAll() {
		return super.findAll(query, root);
	}
	
	public Department findById(Integer id) {
		return super.findById(Department.class, id);
	}
}
