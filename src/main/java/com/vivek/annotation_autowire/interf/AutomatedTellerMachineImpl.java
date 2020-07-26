package com.vivek.annotation_autowire.interf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.vivek.interf.ATMTransport;
import com.vivek.interf.AutomatedTellerMachine;

public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {

	@Autowired (required=true)
    @Qualifier ("standardTransport")
	private ATMTransport transport;
	
	
	@Override
	public void atmPrint() {
		// TODO Auto-generated method stub
		transport.atm_transport_print();
	}

}
