package all.in.one;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vivek.interf.ATMTransport;


@Component("standardTransport")
@Qualifier("default")
public class StandardAtmTransport implements ATMTransport {

	@Override
	public void atm_transport_print() {
		// TODO Auto-generated method stub
		System.out.println(" StandardAtmTransport  default componentPrint menthod");
	}

}
