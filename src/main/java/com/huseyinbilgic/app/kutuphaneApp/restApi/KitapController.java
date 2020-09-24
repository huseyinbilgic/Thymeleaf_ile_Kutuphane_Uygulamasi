package com.huseyinbilgic.app.kutuphaneApp.restApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huseyinbilgic.app.kutuphaneApp.Business.IKitapService;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Kitap;

import com.huseyinbilgic.app.kutuphaneApp.Entities.YayınEvi;
import com.huseyinbilgic.app.kutuphaneApp.Entities.Yazar;



@Controller
public class KitapController {
	private IKitapService kitapservice;
	@Autowired
	public KitapController(IKitapService kitapservice) {

		this.kitapservice = kitapservice;
	}
	
	
	@RequestMapping(value="/filtre",method = RequestMethod.POST)
	public String filtrele(Model model,@ModelAttribute("kitap") Kitap filtrekitap) {
		List<Kitap> filterkitap=kitapservice.kitapara(filtrekitap);
		List<Yazar> yazarlar=new ArrayList<Yazar>();
		List<YayınEvi> yayınevleri=new ArrayList<YayınEvi>();
		List<Map<Kitap, Yazar>> mapsList = new ArrayList<Map<Kitap, Yazar>>();
		for (Kitap kitap : filterkitap) {
			Yazar yazar=kitapservice.getByYazarId(kitap.getYazarid());
			YayınEvi yayınevi=kitapservice.getByYayinId(kitap.getYayineviid());
			yazarlar.add(yazar);
			yayınevleri.add(yayınevi);
		}
		
		
		for (int i = 0; i < filterkitap.size(); i++) {
			 Map<Kitap, Yazar> map = new HashMap<Kitap, Yazar>();
			 map.put(filterkitap.get(i), yazarlar.get(i));
			 mapsList.add(map);
		}
		String kitapad="ee";
		model.addAttribute("kitapad",kitapad);
		model.addAttribute("mapsList",mapsList);
		model.addAttribute("yayınevleri",yayınevleri);
		return "index";
	}
	
	@RequestMapping("/kitaplar")
	public String getAll(Model model){
		
			Kitap kitapara=new Kitap();
			List<Kitap> kitaplar= kitapservice.getall();
			List<Yazar> yazarlar=new ArrayList<Yazar>();
			List<YayınEvi> yayınevleri=new ArrayList<YayınEvi>();
			List<Map<Kitap, Yazar>> mapsList = new ArrayList<Map<Kitap, Yazar>>();
			for (Kitap kitap : kitaplar) {
				Yazar yazar=kitapservice.getByYazarId(kitap.getYazarid());
				YayınEvi yayınevi=kitapservice.getByYayinId(kitap.getYayineviid());
				yazarlar.add(yazar);
				yayınevleri.add(yayınevi);
			}
			
			
			for (int i = 0; i < kitaplar.size(); i++) {
				 Map<Kitap, Yazar> map = new HashMap<Kitap, Yazar>();
				 map.put(kitaplar.get(i), yazarlar.get(i));
				 mapsList.add(map);
			}
			
			
			model.addAttribute("mapsList",mapsList);
			model.addAttribute("yayınevleri",yayınevleri);
			model.addAttribute("kitap",kitapara);

		
		return "index";
	}
	@RequestMapping("/kitapekle")
	public String kitapekle(Model model) {
		List<Yazar> yazarlar=kitapservice.getYazarlar();
		List<YayınEvi> yayinevleri=kitapservice.getYayınEvi();
		
		Kitap kitap=new Kitap();
		model.addAttribute("yazarlar",yazarlar);
		model.addAttribute("yayinevleri",yayinevleri);
		
		model.addAttribute("kitap",kitap);
		return "kitapekle";
	}
	
	
	@RequestMapping("/kitaplar/{id}")
	public ModelAndView kitapduzenle(@PathVariable(name="id") int id) {
		List<Yazar> yazarlar=kitapservice.getYazarlar();
		List<YayınEvi> yayinevleri=kitapservice.getYayınEvi();
		ModelAndView mav=new ModelAndView("kitapduzenle");
		Kitap kitap=kitapservice.getById(id);
		mav.addObject("kitap",kitap);
		mav.addObject("yazarlar",yazarlar);
		mav.addObject("yayinevleri",yayinevleri);
		return mav;
	}
	
	@RequestMapping("/sil/{id}")
	public String kitapsil(@PathVariable(name="id") int id) {
		Kitap kitap=kitapservice.getById(id);
		kitapservice.delete(kitap);
		return "redirect:/kitaplar";
	}
	
	
	@RequestMapping(value="/kaydet",method = RequestMethod.POST)
	public String kaydet(@ModelAttribute("kitap") Kitap kitap) {
		kitapservice.Add(kitap);
		return "redirect:/kitaplar";
	}
	
}
