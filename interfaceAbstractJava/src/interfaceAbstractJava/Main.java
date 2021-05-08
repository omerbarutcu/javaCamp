package interfaceAbstractJava;

import java.time.LocalDate;

import interfaceAbstractJava.Abstract.BaseCustomerManager;
import interfaceAbstractJava.Adapters.MernisServiceAdapter;
import interfaceAbstractJava.Concrete.StarbucksCustomerManager;
import interfaceAbstractJava.Entites.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Ömer","Barutçu","1234567890",LocalDate.of(1984, 4, 21)));
		
		
	}
}
