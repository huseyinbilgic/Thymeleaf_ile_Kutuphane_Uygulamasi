package com.huseyinbilgic.app.kutuphaneApp.DataAccess;

import java.util.List;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;

public interface IYazarDal {
	List<Yazar> getall();
	void Add(Yazar yazar);

	void update(Yazar yazar);

	void delete(Yazar yazar);
	
	
}
