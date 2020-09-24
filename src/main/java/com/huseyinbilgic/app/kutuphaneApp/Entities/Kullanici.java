package com.huseyinbilgic.app.kutuphaneApp.Entities;

import javax.persistence.*;


@Entity
@Table(name = "kullanicilar")
public class Kullanici {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="rol")
	private String rol;
	@Column(name="kullaniciadi")
	private String kullaniciadi;
	@Column(name="sifre")
	private String sifre;
	

	
	
	public Kullanici(int id, String rol, String kullaniciadi, String sifre) {
		this.id = id;
		this.rol = rol;
		this.kullaniciadi = kullaniciadi;
		this.sifre = sifre;

	}
	public Kullanici() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getKullaniciadi() {
		return kullaniciadi;
	}
	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	
	
	
}
