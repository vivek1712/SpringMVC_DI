package all.in.one;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vivek.interf.ATMTransport;
import com.vivek.interf.AutomatedTellerMachine;
@Service ("atm")
public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {
	@Autowired (required=true)
    @Qualifier ("default")
	private ATMTransport transport;
	
	
	@Override
	public void atmPrint() {
		// TODO Auto-generated method stub
		transport.atm_transport_print();
	}

}
