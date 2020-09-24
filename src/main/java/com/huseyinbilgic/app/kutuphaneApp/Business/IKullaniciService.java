package com.huseyinbilgic.app.kutuphaneApp.Business;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Kullanici;

public interface IKullaniciService {
	Kullanici getByNameAndPassword(String name,String password);
}
