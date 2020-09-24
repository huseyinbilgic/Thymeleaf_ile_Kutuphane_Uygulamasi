package com.huseyinbilgic.app.kutuphaneApp.DataAccess;

import java.util.List;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Kitap;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Kullanici;
import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class HibernateKitapDal implements IKitapDal{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateKitapDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Kitap> getall() {
		Session session=entityManager.unwrap(Session.class);
		List<Kitap> kitaplar=session.createQuery("from Kitap").getResultList();
		return kitaplar;
	}

	@Override
	@Transactional
	public void Add(Kitap kitap) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(kitap);
	}

	@Override
	@Transactional
	public void update(Kitap kitap) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(kitap);
		
	}

	@Override
	@Transactional
	public void delete(Kitap kitap) {
		Session session=entityManager.unwrap(Session.class);
		session.delete(kitap);
		
	}

	@Override
	@Transactional
	public Kitap getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Kitap kitap=session.get(Kitap.class, id);
		return kitap;

	}

	@Override
	@Transactional
	public Yazar getByYazarId(int id) {
		Session session=entityManager.unwrap(Session.class);
		Yazar yazar=session.get(Yazar.class, id);
		return yazar;
	}
	
	@Override
	@Transactional
	public YayınEvi getByYayinId(int id) {
		Session session=entityManager.unwrap(Session.class);
		YayınEvi yayinevi=session.get(YayınEvi.class,id);
		return yayinevi;
	}

	@Override
	@Transactional
	public List<Yazar> getYazarlar() {
		Session session=entityManager.unwrap(Session.class);
		List<Yazar> yazarlar=session.createQuery("from Yazar").getResultList();
		return yazarlar;
	}

	@Override
	@Transactional
	public List<YayınEvi> getYayınEvi() {
		Session session=entityManager.unwrap(Session.class);
		List<YayınEvi> yayinevleri=session.createQuery("from YayınEvi").getResultList();
		return yayinevleri;
	}

	@Override
	public List<Kitap> kitapara(Kitap kitap) {
		Session session=entityManager.unwrap(Session.class);
		 Query  query=session.createQuery("from Kitap k where k.ad like ?1");
		 query.setParameter(1, "%"+kitap.getAd()+"%");
		
		List<Kitap> kitap1=query.list();
		if (kitap1.size()>0) {
			return kitap1;
		}
		
		return null;
	}

}
