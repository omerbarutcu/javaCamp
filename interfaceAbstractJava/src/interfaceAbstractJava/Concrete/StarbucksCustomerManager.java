package interfaceAbstractJava.Concrete;

import interfaceAbstractJava.Abstract.BaseCustomerManager;
import interfaceAbstractJava.Abstract.CustomerCheckService;
import interfaceAbstractJava.Entites.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.ChackIfRealPerson(customer)) {
			super.save(customer);
		}
		else {System.out.println("Ge�ersiz kullan�c�");
		}
	}

}
