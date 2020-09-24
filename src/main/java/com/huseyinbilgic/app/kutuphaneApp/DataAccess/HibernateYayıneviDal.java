package com.huseyinbilgic.app.kutuphaneApp.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository

public class HibernateYayıneviDal implements IYayıneviDal{

private EntityManager entityManager;
	
	@Autowired
	public HibernateYayıneviDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	@Transactional
	public List<YayınEvi> getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void Add(YayınEvi yayinevi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(YayınEvi yayinevi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(YayınEvi yayinevi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public YayınEvi getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
