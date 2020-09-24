package com.huseyinbilgic.app.kutuphaneApp.Business;

import java.util.List;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;

public interface IYazarService {
	List<Yazar> getall();
	void Add(Yazar yazar);

	void update(Yazar yazar);

	void delete(Yazar yazar);
	
	Yazar getById(int id);
}
