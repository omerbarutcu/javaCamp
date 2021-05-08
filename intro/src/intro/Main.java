package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu="Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugün=8.19;
		int vade =36;
		boolean fark=true;
		
		System.out.println(internetSubeButonu);
		
		
		if(dolarBugün<dolarDun) {
			System.out.println("Dolar düþtü resmi");
			
		}else {
			System.out.println("Dolar yükseldi resmi");
		}
		
		
		String[] krediler= 
			{
				"Hýzlý Kredi",
				"Bireysek Kredi",
				"Ýhtiyaç kredisi",
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
