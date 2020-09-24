package com.huseyinbilgic.app.kutuphaneApp.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class HibernateYazarDal implements IYazarDal{
private EntityManager entityManager;
	
	@Autowired
	public HibernateYazarDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Yazar> getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void Add(Yazar yazar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(Yazar yazar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(Yazar yazar) {
		// TODO Auto-generated method stub
		
	}

	

}
