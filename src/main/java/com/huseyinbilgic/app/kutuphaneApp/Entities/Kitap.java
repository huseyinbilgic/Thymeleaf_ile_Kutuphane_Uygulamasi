package com.huseyinbilgic.app.kutuphaneApp.Entities;
import javax.persistence.*;


@Entity
@Table(name = "kitap")
public class Kitap {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="kitapaltad")
	private String kitapaltad;
	
	@Column(name="seriad")
	private String seriad;
	
	@Column(name="yazarid")
	private int yazarid;
	
	@Column(name="yayineviid")
	private int yayineviid;
	
	@Column(name="isbnnumara")
	private String isbnnumara;
	
	@Column(name="aciklama")
	private String aciklama;

	public Kitap(int id, String ad, String kitapaltad, String seriad, int yazarid, int yayineviid,
			String isbnnumara, String aciklama) {
		this.id = id;
		this.ad = ad;
		this.kitapaltad = kitapaltad;
		this.seriad = seriad;
		this.yazarid = yazarid;
		this.yayineviid = yayineviid;
		this.isbnnumara = isbnnumara;
		this.aciklama = aciklama;
	}
	public Kitap() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getKitapaltad() {
		return kitapaltad;
	}

	public void setKitapaltad(String kitapaltad) {
		this.kitapaltad = kitapaltad;
	}

	public String getSeriad() {
		return seriad;
	}

	public void setSeriad(String seriad) {
		this.seriad = seriad;
	}

	public int getYazarid() {
		return yazarid;
	}

	public void setYazarid(int yazarid) {
		this.yazarid = yazarid;
	}

	public int getYayineviid() {
		return yayineviid;
	}

	public void setYayineviid(int yayineviid) {
		this.yayineviid = yayineviid;
	}

	public String getIsbnnumara() {
		return isbnnumara;
	}

	public void setIsbnnumara(String isbnnumara) {
		this.isbnnumara = isbnnumara;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	

}
