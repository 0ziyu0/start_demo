package com.boot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class freemarkerController {

	@RequestMapping("/fremarker")
	public String fremarker(Map<String, Object> resultMap) {
		
//		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("name", "张三");
		resultMap.put("sex", 0);
		resultMap.put("age", 25);
		
		return "index";
	}
	
}
