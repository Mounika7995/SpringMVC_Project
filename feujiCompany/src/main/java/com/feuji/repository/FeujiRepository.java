package com.feuji.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.feuji.bean.FeujiSolutions;
import com.feuji.entity.FeujiEntity;


@Repository
@Transactional
public class FeujiRepository {
	
	@Autowired
	protected HibernateTemplate hibernateTemplate;
	
	public void save(FeujiEntity entity) {
		hibernateTemplate.save(entity);
	}
}
