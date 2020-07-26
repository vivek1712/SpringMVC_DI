package com.mkyong.common.controller;

import com.vivek.Transport.usage.SimulationAtmTransport;
import com.vivek.Transport.usage.SoapAtmTransport;
import com.vivek.Transport.usage.StandardAtmTransport;
import com.vivek.interf.ATMTransport;
import com.vivek.interf.AutomatedTellerMachine;
import com.vivek.interf.impl.AutomatedTellerMachineImpl;

public class Without_DI_Spring {
public static void main(String arg[]){
	AutomatedTellerMachine atm = new AutomatedTellerMachineImpl();
	ATMTransport transport = new SoapAtmTransport();
	((AutomatedTellerMachineImpl)atm).setTransport(transport);
	atm.atmPrint();
	
	ATMTransport transport1 = new SimulationAtmTransport();
	((AutomatedTellerMachineImpl)atm).setTransport(transport1);
	atm.atmPrint();
	
	ATMTransport transport2 = new StandardAtmTransport();
	((AutomatedTellerMachineImpl)atm).setTransport(transport2);
	atm.atmPrint();
}
}
