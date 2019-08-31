package com.fendo.Test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		//System.out.println("登陆："+loginAccount+" "+loginPassword); 
		return "success";
	}
	
	@RequestMapping(value="/login2", produces = "application/json;charset=UTF-8")
	public @ResponseBody ModelAndView userLogin2(String uname,String upwd){
		boolean result = true;
		Map<String, Boolean> map = new HashMap<>();
		map.put("valid", result);
		//System.out.println("登陆："+loginAccount+" "+loginPassword); 
		//return "success";
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}

	@RequestMapping(value="/login3", produces = "application/json;charset=UTF-8")
	public @ResponseBody
	String userLogin3(String uname,String upwd){
		boolean result = true;
		String resultString = "{\"result\":true}";
		//System.out.println("登陆："+loginAccount+" "+loginPassword); 
		//return "success";
		return resultString;
	}
	@PostMapping(value="/login4", produces = "application/json;charset=UTF-8")
	public @ResponseBody
	String userLogin4(String loginAccount,String loginPassword){
		boolean result = true;
		String resultString = "{\"result\":true}";
		System.out.println("登陆："+loginAccount+" "+loginPassword); 
		//return "success";
		return resultString;
	}
	@PostMapping(value="/login5.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody
	ModelAndView userLogin5(String loginAccount,String loginPassword){
		boolean result = true;
		//String resultString = "{\"result\":true}";
		Map<String, String> map = new HashMap<>();
		map.put("flag", "00");
		map.put("url", "http://localhost:8080/user/userIndex.htm");
		map.put("msg", "登陆成功！");
		System.out.println("登陆："+loginAccount+" "+loginPassword); 
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}
	@PostMapping(value="/login.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody
	String userLogin(String loginAccount,String loginPassword){
		boolean result = true;
		String resultString = "{\"flag\":\"00\",\"url\":\"http://localhost:8080/user/userIndex.htm\"}";
		//Map<String, String> map = new HashMap<>();
		//map.put("flag", "00");
		//map.put("url", "http://localhost:8080/user/userIndex.htm");
		//map.put("msg", "登陆成功！");
		System.out.println("登陆："+loginAccount+" "+loginPassword); 
		return resultString;
	}
	
}
