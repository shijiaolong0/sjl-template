package com.sjl.system.config;

import org.springframework.boot.context.properties.ConfigurationProperties; 
import org.springframework.stereotype.Component;

@Component //组件类，springboot会在启动时加载它
@ConfigurationProperties(prefix="app")
public class AppConfig {
	private String name;
	private String version;
	private String author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
