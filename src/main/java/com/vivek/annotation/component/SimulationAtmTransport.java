package com.vivek.annotation.component;

import org.springframework.stereotype.Component;

import com.vivek.interf.ATMTransport;

@Component("simulationTransport")
public class SimulationAtmTransport implements ATMTransport{

	@Override
	public void atm_transport_print() {
		// TODO Auto-generated method stub
		System.out.println(" SimulationAtmTransport component Print menthod");
	}

}
