package interfaceAbstractJava.Concrete;

import interfaceAbstractJava.Abstract.CustomerCheckService;
import interfaceAbstractJava.Entites.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean ChackIfRealPerson(Customer customer) {
		
		return true;
	}

}
