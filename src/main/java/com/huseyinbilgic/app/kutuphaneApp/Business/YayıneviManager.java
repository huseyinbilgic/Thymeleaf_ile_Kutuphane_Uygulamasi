package com.huseyinbilgic.app.kutuphaneApp.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinbilgic.app.kutuphaneApp.DataAccess.IYayıneviDal;
import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;
@Service
public class YayıneviManager  implements IYayıneviService{
	private IYayıneviDal yayıneviDal;
	@Autowired
	public YayıneviManager(IYayıneviDal yayıneviDal) {
		this.yayıneviDal = yayıneviDal;
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
