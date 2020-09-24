package com.huseyinbilgic.app.kutuphaneApp.Business;

import java.util.List;

import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;

public interface IYayıneviService {
	List<YayınEvi> getall();
	void Add(YayınEvi city);

	void update(YayınEvi city);

	void delete(YayınEvi city);
	
	YayınEvi getById(int id);
}
