package com.mkyong.common.controller;
 
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vivek.entity.MessagesPass;

@Controller
public class HelloWorldController{
 
	//@RequestMapping(method = RequestMethod.GET)
	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello vivek spring world");
 
		return model;
	}
	
	@ResponseBody
	@RequestMapping(value="/changeMsg")
	public String getNewMsg(){
		
	//	AjaxResponseBody result=new AjaxResponseBody();
		
		return "Raj";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/changeMsgJsp",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ModelAndView helloWorldJspAjax(@RequestBody MessagesPass msgpass){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello "+msgpass.getName() +" u changed spring world");
 
		return model;
	}
}
