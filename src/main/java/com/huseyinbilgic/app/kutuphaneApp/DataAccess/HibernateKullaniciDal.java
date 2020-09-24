package com.huseyinbilgic.app.kutuphaneApp.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Kullanici;
@Repository
public class HibernateKullaniciDal implements IKullaniciDal{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateKullaniciDal(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public Kullanici getByNameAndPassword(String name, String password) {
		Session session=entityManager.unwrap(Session.class);
		 Query  query=session.createQuery("from Kullanici k where k.kullaniciadi = :name and k.sifre = :password");
		query.setParameter("name",name);
		query.setParameter("password",password);
		List<Kullanici> kullanici=query.list();
		if (kullanici.size()>0) {
			return kullanici.get(0);
		}
		return null;
	}

}
