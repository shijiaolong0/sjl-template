package com.sjl.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 配置默认的首页
 * @author 2654016602@qq.com
 *
 */
@Controller
@RequestMapping({"/",""})
public class IndexController {
	
	@GetMapping({"/",""})
	String welcome() {
		return "redirect:/welcome";
	}
	
	@GetMapping("/welcome")
	String index() {
		return "system/welcome";
	}
}
