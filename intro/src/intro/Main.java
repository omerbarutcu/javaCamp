package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBug�n=8.19;
		int vade =36;
		boolean fark=true;
		
		System.out.println(internetSubeButonu);
		
		
		if(dolarBug�n<dolarDun) {
			System.out.println("Dolar d��t� resmi");
			
		}else {
			System.out.println("Dolar y�kseldi resmi");
		}
		
		
		String[] krediler= 
			{
				"H�zl� Kredi",
				"Bireysek Kredi",
				"�htiya� kredisi",
				"Konut Kredisi"
				};
		
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		for (int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
		}
		
		
		
	}
	
}
