package com.dubbo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dubbo.service.DubboService;


@Service
public class DubboServiceImpl implements DubboService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DubboServiceImpl.class);
	
	@Override
	public String dubboTest(String name) {
		LOGGER.info("=======" + name + "connection dubbo success=======");
		return "SUCCESS";
	}

}
