package com.khw.vision;

import org.eclipse.jdt.internal.compiler.ast.LabeledStatement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VisionController {
	
	ModelAndView mav = new ModelAndView();

	@RequestMapping("vision.main")
	public String mainform(){
		return "mainform";
	}
	
	@RequestMapping(value="vision.test", method=RequestMethod.POST)
	public ModelAndView run(MultipartFile file) throws Exception{
		String as[] = new String[1];
		as[0] = "C:/test/" + file.getOriginalFilename();
		
		TextApp.main(as);
		LabelApp.main(as);
		ColorClass.main(as);
		
		mav.addObject("color", ColorClass.colormap);
		mav.addObject("text", TextApp.result);
		mav.addObject("label", LabelApp.list);
		mav.addObject("img", as[0]);
		mav.setViewName("test");
		
		return mav;
	}
	
}
