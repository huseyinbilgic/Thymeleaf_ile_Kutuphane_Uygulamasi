package com.huseyinbilgic.app.kutuphaneApp.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huseyinbilgic.app.kutuphaneApp.Business.IKullaniciService;

import com.huseyinbilgic.app.kutuphaneApp.Entities.Kullanici;

@Controller
public class KullaniciController {
	private IKullaniciService kullaniciservice;
	private Kullanici anakullanici = null;

	@Autowired
	public KullaniciController(IKullaniciService kullaniciservice) {
		this.kullaniciservice = kullaniciservice;
	}

	@RequestMapping("/")
	public String getKullanici(Model model) {

		if (anakullanici == null) {
			Kullanici kullanici = new Kullanici();
			model.addAttribute("kullanici", kullanici);
			return "anasayfa";
		}
		return "login";
	}

	@RequestMapping(value = "/kontrol", method = RequestMethod.POST)
	public ModelAndView kontrol(@ModelAttribute("kullanici") Kullanici kullanici) {
		
		Kullanici kullanici1 = this.kullaniciservice.getByNameAndPassword(kullanici.getKullaniciadi(),
				kullanici.getSifre());
		ModelAndView mav;
		if (kullanici1 != null) {
			mav=new ModelAndView("redirect:/kitaplar");
			anakullanici = kullanici1;
			return mav;
		}
		mav=new ModelAndView("redirect:/");
		return mav;

	}
	@RequestMapping("/yetkisiz")
	public String yetkisiz() {
		return "notfound";
	}

}
