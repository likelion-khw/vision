package com.khw.vision;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VisionController {
	
	ModelAndView mav = new ModelAndView();
	
	ArrayList<TextVO> text;
	
	@Autowired
	DataServiceImp service;
	
	@Autowired
	DataVO dvo;
	
	@ModelAttribute("region")
	public List<RegionVO> regionAll(){
		return service.getRegion();
	}
	
	@ModelAttribute("storeAll")
	public List<StoreVO> getStoreAll(){
		return service.getStoreAll();
	}

	@RequestMapping("vision.main")
	public String mainform(){
		return "mainform";
	}
	
	@RequestMapping(value="vision.storeInput" , method=RequestMethod.GET)
	public String storeInput(){
		return "storeInputform";
	}
	
	@RequestMapping(value="vision.storeInput" , method=RequestMethod.POST)
	public String storeInput(StoreVO store){
		service.storeInput(store);
		return "redirect:/vision.main";
	}
	
	@RequestMapping(value="vision.test", method=RequestMethod.POST)
	public ModelAndView searchStore(MultipartFile file, int rcode) throws Exception{
		
		String path= "C:/test/" + file.getOriginalFilename();
		
		dvo.setText(TextApp.run2(path));
		dvo.setColor(ColorClass.run2(path));
		dvo.setRcode(rcode);
		
		mav.addObject("resultStore", service.searchStore(dvo));
		mav.setViewName("result");
		
		
		return mav;
	}
	
	@RequestMapping(value="vision.infoInput", method=RequestMethod.GET)
	public String infoInput(@ModelAttribute("store_code") int store_code){
		return "infoInputform";
	}
	
	@RequestMapping(value="vision.infoInput", method=RequestMethod.POST)
	public String infoInput(int store_code, MultipartFile file) throws Exception{
		System.out.println(store_code);
		String path= "C:/test/" + file.getOriginalFilename();
		
		service.textInput(TextApp.run(path, store_code));
		service.colorInput(ColorClass.run(path, store_code));
		
		return "redirect:/vision.main";
	}
	
	@RequestMapping("vision.getStoreText")
	public ModelAndView getStoreText(int store_code){
		
		mav.addObject("storetext",service.getStoreText(store_code));
		mav.setViewName("storetext");
		return mav;
	}
	
	@RequestMapping("vision.getStoreColor")
	public ModelAndView getStoreColor(int store_code){
		
		mav.addObject("storecolor",service.getStoreColor(store_code));
		mav.setViewName("storecolor");
		return mav;
	}
	
}