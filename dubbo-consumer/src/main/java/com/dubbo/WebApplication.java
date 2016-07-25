package com.dubbo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"}) //加入spring的bean的xml文件
public class WebApplication extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebApplication.class);
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				LOGGER.info("===========dubbo consumer start===========");
			}
		};
	}
}
