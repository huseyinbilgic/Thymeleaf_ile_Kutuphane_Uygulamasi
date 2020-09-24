package com.huseyinbilgic.app.kutuphaneApp.DataAccess;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Kullanici;

public interface IKullaniciDal {
	Kullanici getByNameAndPassword(String name,String password);
}
