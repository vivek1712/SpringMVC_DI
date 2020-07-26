package all.in.one;

import org.springframework.stereotype.Component;

import com.vivek.interf.ATMTransport;
@Component("soapTransport")
public class SoapAtmTransport implements ATMTransport{

	@Override
	public void atm_transport_print() {
		// TODO Auto-generated method stub
		System.out.println("Soap Atm Transport component print method called");
	}

}
