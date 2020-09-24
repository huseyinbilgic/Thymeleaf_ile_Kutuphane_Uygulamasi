package com.huseyinbilgic.app.kutuphaneApp.Entities;
import javax.persistence.*;

@Entity
@Table(name = "yazar")
public class Yazar {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="aciklama")
	private String aciklama;

	public Yazar(int id, String ad, String aciklama) {
		this.id = id;
		this.ad = ad;
		this.aciklama = aciklama;
	}
	public Yazar() {
		
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

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	
}
