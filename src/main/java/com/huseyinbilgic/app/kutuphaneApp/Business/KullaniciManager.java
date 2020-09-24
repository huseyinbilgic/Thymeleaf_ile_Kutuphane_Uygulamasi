package com.huseyinbilgic.app.kutuphaneApp.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinbilgic.app.kutuphaneApp.DataAccess.IKullaniciDal;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Kullanici;
@Service
public class KullaniciManager implements IKullaniciService{
	private IKullaniciDal kullaniciDal;
	
	@Autowired
	public KullaniciManager(IKullaniciDal kullaniciDal) {
		this.kullaniciDal = kullaniciDal;
	}
	
	@Override
	@Transactional
	public Kullanici getByNameAndPassword(String name, String password) {
		return this.kullaniciDal.getByNameAndPassword(name, password);
	}

}
