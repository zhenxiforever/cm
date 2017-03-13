package com.cm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * classpath路径：locations={"classpath:applicationContext1.xml","classpath:applicationContext2.xml"}
 * file路径： locations = {"file:d:/test/applicationContext.xml"};
 */
@Configuration
@ImportResource(locations={"classpath:config/applicationContext.xml"})
public class SpringBeanConfig {

}
