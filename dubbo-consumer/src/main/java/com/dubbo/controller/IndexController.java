package com.dubbo.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	
//	@Autowired
//	private DubboService dubboService;
	
	@RequestMapping("/")
	public String home(Model model, HttpServletRequest request, String name){
//		dubboService.dubboTest(name);
		LOGGER.info("======dubbo test=======");
		return "home";
	}
}