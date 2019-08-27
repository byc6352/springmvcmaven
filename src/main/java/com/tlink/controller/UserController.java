/**
 * 
 */
package com.tlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HUASINE
 *
 */
@RequestMapping("/user")
@Controller
public class UserController {
	@RequestMapping(value="/login")
	public String add(String uname,String upwd){
		System.out.println("添加操作的业务逻辑login:"+uname+" "+upwd);
		return "success";
	}
	@PostMapping(value="/login.htm")
	public @ResponseBody
	String loginSys(String loginAccount,String loginPassword) {
		return "success";
	}
	
}
