package com.dubbo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import com.alibaba.dubbo.rpc.Exporter;
/**
 * dubbo 相关配置
 * @author fuhongxing
 */
@Configuration
@ConditionalOnClass(Exporter.class)
public class DubboConfig {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DubboConfig.class);
	
    @Value("${dubbo.application.name}")
    private String applicationName;

    @Value("${dubbo.registr.protocol}")
    private String protocol;

    @Value("${dubbo.registry.address}")
    private String registryAddress;
    
    /**
     * 设置dubbo扫描包
     * @param packageName
     * @return
     */
    @Bean
    public static AnnotationBean annotationBean(@Value("${dubbo.annotation.package}") String packageName) {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(packageName);
        return annotationBean;
    }
    
    /**
     * 注入dubbo上下文
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        // 当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(this.applicationName);
        return applicationConfig;
    }

    /**
     * 连接dubbo注册中心配置,基于zookeeper
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
    	LOGGER.info("连接dubbo注册中心...");
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol(protocol);
        registry.setAddress(registryAddress);
        return registry;
    }

}