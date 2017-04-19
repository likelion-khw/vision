package com.khw.vision;

import java.util.List;

public interface DataService {
	public void storeInput(StoreVO store);
	public List<RegionVO> getRegion();
	public void textInput(List<TextVO> text);
	public void colorInput(ColorVO color);
	public List<StoreVO> searchStore(DataVO vo);
	public List<StoreVO> getStoreAll();
	public List<TextVO> getStoreText(int store_code);
	public List<ColorVO> getStoreColor(int store_code);
}