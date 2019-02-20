package com.sjl.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@ServletComponentScan//注册当前模块下的filter,servlet,listener,使之能起作用
@MapperScan("com.sjl.*.dao") 
@SpringBootApplication
public class SjlTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SjlTemplateApplication.class, args);
		System.out.println("ヾ(◍°∇°◍)ﾉﾞ    bootdo启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                " ______                    _   ______            \n" +
                "|_   _ \\                  / |_|_   _ `.          \n" +
                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
		//启动方式二：resources下新建banner.txt,也可关闭banner，如下
		/*SpringApplication app= new SpringApplication(ShijiaolongApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);*/
	}

}

