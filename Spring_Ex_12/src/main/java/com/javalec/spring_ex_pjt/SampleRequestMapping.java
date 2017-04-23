package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class SampleRequestMapping {

	@RequestMapping("/view")
	public String View(){
		return "/board/view";
	}
	
	// /board + /view  = /board/view 로 ㅊ자아간다. 
}
