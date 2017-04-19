package com.khw.vision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImp implements DataService {
	
	@Autowired
	DataDAO dao;
	
	public void storeInput(StoreVO store){
		dao.storeInput(store);
	}
	public List<RegionVO> getRegion(){
		return dao.getRegion();
	}
	public void textInput(List<TextVO> text){
		dao.textInput(text);
	}
	public void colorInput(ColorVO color){
		dao.colorInput(color);
	}
	public List<StoreVO> searchStore(DataVO vo){
		return dao.searchStore(vo);
	}
	
	public List<StoreVO> getStoreAll(){
		return dao.getStoreAll();
	}
	
	public List<TextVO> getStoreText(int store_code){
		return dao.getStoreText(store_code);
		
	}
	public List<ColorVO> getStoreColor(int store_code){
		return dao.getStoreColor(store_code);
	}
}