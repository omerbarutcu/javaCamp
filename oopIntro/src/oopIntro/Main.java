package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product(1,"Lenovo V14",15000,"16gb Ram",10); //referans oluþturma ,instance
		
		
		Product product2=new Product(); //referans oluþturma ,instance
		product2.setId(2);
		product2.setName("Lenovo L15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitePrice(16000);
		
		System.out.println(product2.getUnitePriceAfterDiscount());
		
		
		
	}

}
