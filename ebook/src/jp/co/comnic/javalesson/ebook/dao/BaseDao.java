package jp.co.comnic.javalesson.ebook.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.commons.beanutils.BeanUtils;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 * <p>DAOクラスの共通となる基底クラス。</p>
 * 
 * @author M.Yoneyama
 * @version 2.0
 */
public class BaseDao {

	protected EntityManager em = Persistence.createEntityManagerFactory("ems-v3").createEntityManager();
	protected EntityTransaction tx = em.getTransaction();
	protected CriteriaBuilder builder = em.getCriteriaBuilder();
	
	/**
	 * <p>全件検索</p>
	 * 
	 * @param query
	 * @param root
	 * @return 検索結果のエンティティ・オブジェクトが格納されたリスト
	 */
	protected <T> List<T> findAll(CriteriaQuery<T> query, Root<T> root) {
		return em.createQuery(query.select(root)).getResultList();
	}
	
	/**
	 * <p>主キー検索</p>
	 * 
	 * @param entityClass
	 * @param id
	 * @return 検索結果のエンティティ・オブジェクト
	 */
	public <T> T findById(Class<T> entityClass, Serializable id) {
		return em.find(entityClass, id);
	}
		
}