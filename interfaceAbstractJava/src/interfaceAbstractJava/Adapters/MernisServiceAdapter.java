package interfaceAbstractJava.Adapters;

import java.rmi.RemoteException;

import interfaceAbstractJava.Abstract.CustomerCheckService;
import interfaceAbstractJava.Entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean ChackIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
