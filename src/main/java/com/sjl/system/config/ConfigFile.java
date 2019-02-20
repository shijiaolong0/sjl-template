package com.sjl.system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
/**
 *属性文件注入
 */
@PropertySource(value = { "classpath:application.properties" })
public class ConfigFile {
	@Value("${app.name}")
	private String name;
	
}
