package com.dubbo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.DubboService;

@Service
public class DubboTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(DubboTest.class);
	
	@Reference
	private DubboService dubboService;
	
	public String test(String name){
		dubboService.dubboTest(name);
		LOGGER.info("======dubbo test=======");
		return "home";
	}

}
