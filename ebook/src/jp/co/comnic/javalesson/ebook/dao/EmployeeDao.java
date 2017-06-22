package jp.co.comnic.javalesson.ebook.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.commons.beanutils.BeanUtils;

import jp.co.comnic.javalesson.ebook.entity.Department;
import jp.co.comnic.javalesson.ebook.entity.Employee;

/**
 * <p>従業員テーブルのCRUD操作を実装するDAOクラス</p>
 * 
 * @author M.Yoneyama
 * @version 2.0
 */
public class EmployeeDao extends BaseDao {
		
	public EmployeeDao() throws DaoException {}
	
	private CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
	private Root<Employee> root = query.from(Employee.class);
	
	public List<Employee> findAll() {
		return super.findAll(query, root);
	}
	
	public Employee findById(Integer id) {
		return super.findById(Employee.class, id);
	}

//	@Override
//	public void insert(Object entity, Map<String, String> properties) throws DaoException {
//		
//		// hire_date
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date date = sdf.parse(properties.get("hire_date"));
//		
//			// Department
//			String id = properties.get("dept_id");
//			Department department = em.find(Department.class, Integer.parseInt(id));
//			
//			properties.remove("hire_date");
//			properties.remove("dept_id");
//			
//			Employee employee = (Employee)entity;
//
//			BeanUtils.populate(employee, properties);
//			
//			employee.setHireDate(date);
//			employee.setDepartment(department);
//			
//			super.insert(employee);
//			
//		} catch (IllegalAccessException | InvocationTargetException | ParseException e) {
//			throw new DaoException(e);
//		}
//	}
}
