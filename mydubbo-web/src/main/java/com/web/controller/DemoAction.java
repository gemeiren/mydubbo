package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Description : 例子
 * @Date: 2018年5月27日 上午10:35:35
 */
@Controller
public class DemoAction{

	@RequestMapping("/404.jsp")
	public @ResponseBody String test(){
		System.out.println("AAA");
		return "404页面";
	}
	
	@RequestMapping("/500.jsp")
	public @ResponseBody String error(){
		System.out.println("500");
		return "500页面";
	}
	
	//http://localhost:9080/mydubbo-web/aaa
	@RequestMapping("/aaa")
	public @ResponseBody String aaa(){
		System.out.println("AAA");
		
		String result1 = "BBBB";
		System.out.println(result1);
		
		//System.out.println(list);
		
		return "BBBB-正常页面";
	}
}