package com.huseyinbilgic.app.kutuphaneApp.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huseyinbilgic.app.kutuphaneApp.DataAccess.IYazarDal;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;
@Service
public class YazarManager implements IYazarService{
	private IYazarDal yazarDal;
	@Autowired
	public YazarManager(IYazarDal yazarDal) {
		super();
		this.yazarDal = yazarDal;
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

	@Override
	@Transactional
	public Yazar getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
