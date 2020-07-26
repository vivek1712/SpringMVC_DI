package com.mkyong.common.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.annotation.component.AutomatedTellerMachineImpl;
import com.vivek.interf.AutomatedTellerMachine;
//import all.in.one.AutomatedTellerMachineImpl;

public class component_service_Interface_With_DI_Spring {
public static void main(String arg[]){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mvc-servlet.xml");
	//AutomatedTellerMachine atm = (AutomatedTellerMachine) ctx.getBean("atm");
	
	AutomatedTellerMachineImpl atm = (AutomatedTellerMachineImpl) ctx.getBean("atm");
	atm.atmPrint();
}
}
