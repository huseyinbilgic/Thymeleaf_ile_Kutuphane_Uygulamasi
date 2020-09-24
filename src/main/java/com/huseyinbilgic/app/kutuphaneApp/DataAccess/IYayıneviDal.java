package com.huseyinbilgic.app.kutuphaneApp.DataAccess;

import java.util.List;

import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;


public interface IYayıneviDal {
	List<YayınEvi> getall();
	void Add(YayınEvi yayinevi);

	void update(YayınEvi yayinevi);

	void delete(YayınEvi yayinevi);
	
	YayınEvi getById(int id);

}
