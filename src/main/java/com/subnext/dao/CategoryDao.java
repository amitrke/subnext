/**
 * 
 */
package com.subnext.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.subnext.entity.CategoryEntity;

/**
 * Category DAO.
 * 
 * @author amit
 *
 */
@Repository
public class CategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public Long create(CategoryEntity categoryEntity){
		Session session = sessionFactory.getCurrentSession();
		return (Long) session.save(categoryEntity);
	}
	
	@Transactional
	public CategoryEntity get(Long id){
		Session session = sessionFactory.getCurrentSession();
		return (CategoryEntity) session.get(CategoryEntity.class, id);
	}
}
