package com.mkyong.common.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.entity.Address;
import com.vivek.entity.Student;

public class DICheckClass {
public static void main(String arg[]){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mvc-servlet.xml");
	Student stuObj=(Student) ctx.getBean("student");
	System.out.println(stuObj);
	
	Address addObj=(Address) ctx.getBean("address");
	System.out.println(addObj);
	
	
	//System.out.println(stuObj.getAddress().getStreetName());
	/*System.out.println(stuObj.getId());
	System.out.println(stuObj.getStuName());
	System.out.println(stuObj.getCourseName());*/
}
}
