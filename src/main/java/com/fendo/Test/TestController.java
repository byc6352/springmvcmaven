package com.fendo.Test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@RequestMapping("/user")
@Controller
public class TestController {
	

	@RequestMapping(value="/login1")
	public String add(String uname,String upwd){
		System.out.println("添加操作的业务逻辑test:"+uname+" "+upwd);
		return "success";
	}
	
	@RequestMapping(value="/login2", produces = "application/json;charset=UTF-8")
	public @ResponseBody ModelAndView userLogin2(String uname,String upwd){
		boolean result = true;
		Map<String, Boolean> map = new HashMap<>();
		map.put("valid", result);
		System.out.println("添加操作的业务逻辑test:"+uname+" "+upwd);
		//return "success";
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}

	@RequestMapping(value="/login", produces = "application/json;charset=UTF-8")
	public @ResponseBody
	String userLogin(String uname,String upwd){
		boolean result = true;
		String resultString = "{\"result\":true}";
		System.out.println("添加操11作的业务逻辑test:"+uname+" "+upwd);
		//return "success";
		return resultString;
	}
	
}
