package com.huseyinbilgic.app.kutuphaneApp.Business;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinbilgic.app.kutuphaneApp.DataAccess.IKitapDal;
import com.huseyinbilgic.app.kutuphaneApp.DataAccess.IYazarDal;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Kitap;
import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;

@Service
public class KitapManager implements IKitapService {
	private IKitapDal kitapDal;

	@Autowired
	public KitapManager(IKitapDal kitapDal) {
		this.kitapDal = kitapDal;
	}

	@Override
	@Transactional
	public List<Kitap> getall() {
		return this.kitapDal.getall();
	}

	@Override
	@Transactional
	public void Add(Kitap kitap) {

		this.kitapDal.Add(kitap);

	}

	@Override
	@Transactional
	public void update(Kitap kitap) {
		this.kitapDal.update(kitap);

	}

	@Override
	@Transactional
	public void delete(Kitap kitap) {
		this.kitapDal.delete(kitap);
	}

	@Override
	@Transactional
	public Kitap getById(int id) {
		return kitapDal.getById(id);
	}

	@Override
	public Yazar getByYazarId(int id) {
		return kitapDal.getByYazarId(id);
	}

	@Override
	public YayınEvi getByYayinId(int id) {
		return kitapDal.getByYayinId(id);
	}

	@Override
	public List<Yazar> getYazarlar() {

		return kitapDal.getYazarlar();
	}

	@Override
	public List<YayınEvi> getYayınEvi() {
		// TODO Auto-generated method stub
		return kitapDal.getYayınEvi();
	}

	@Override
	public  List<Kitap> kitapara(Kitap kitap) {
		return kitapDal.kitapara(kitap);
	}

}
