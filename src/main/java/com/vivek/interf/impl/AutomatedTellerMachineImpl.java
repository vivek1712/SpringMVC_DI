package com.vivek.interf.impl;

import com.vivek.interf.ATMTransport;
import com.vivek.interf.AutomatedTellerMachine;

public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {

	private ATMTransport transport;
	
	public ATMTransport getTransport() {
		return transport;
	}

	public void setTransport(ATMTransport transport) {
		this.transport = transport;
	}

	@Override
	public void atmPrint() {
		// TODO Auto-generated method stub
		transport.atm_transport_print();
	}

}
