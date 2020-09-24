package com.huseyinbilgic.app.kutuphaneApp.Business;

import java.util.List;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Kitap;
import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;

public interface IKitapService {
	List<Kitap> getall();
	void Add(Kitap kitap);

	void update(Kitap kitap);

	void delete(Kitap kitap);
	
	Kitap getById(int id);
	Yazar getByYazarId(int id) ;
	YayınEvi getByYayinId(int id);
	
	List<Yazar> getYazarlar();
	List<YayınEvi> getYayınEvi();
	
	 List<Kitap> kitapara(Kitap kitap);
}
