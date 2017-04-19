package com.khw.vision;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataDAO {

	@Autowired
	SqlSession service;

	@Autowired
	SearchVO svo;

	List<StoreVO> temp;

	public void storeInput(StoreVO store) {
		service.insert("vision.storeInput", store);
	}

	public List<RegionVO> getRegion() {
		return service.selectList("vision.regionAll");
	}

	public void textInput(List<TextVO> text) {
		for (TextVO t : text) {
			if (service.selectList("vision.haveText", t).size() == 0) {
				service.insert("vision.textInput", t);
			}
		}
	}

	public void colorInput(ColorVO color) {
		if (service.selectList("vision.haveColor", color).size() == 0) {
			service.insert("vision.colorInput", color);
		}
	}

	public List<StoreVO> searchStore(DataVO vo) {
		svo.setColor(vo.getColor());
		svo.setRcode(vo.getRcode());
		for (TextVO t : vo.getText()) {
			svo.setText(t.getText());
			if (service.selectList("vision.searchStore", svo) != null) {
				temp = service.selectList("vision.searchStore", svo);
				// if (temp == null) {
				// temp = stemp;
				// } else {
				// for (StoreVO s : temp) {
				// for (StoreVO st : stemp) {
				// if (s.getStore_code() != st.getStore_code()) {
				// temp.add(st);
				// }
				// }
				// }
				// }
			}
		}
		return temp;
	}

	public List<StoreVO> getStoreAll() {
		return service.selectList("vision.getStoreAll");
	}
	
	public List<TextVO> getStoreText(int store_code){
		return service.selectList("vision.getStoreText",store_code);
		
	}
	public List<ColorVO> getStoreColor(int store_code){
		return service.selectList("vision.getStoreColor",store_code);
	}
}