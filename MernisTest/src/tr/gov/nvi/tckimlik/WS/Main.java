package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		boolean result =kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("54889548664"), 
				"�MER", 
				"BARUT�U", 
				1984
				);
		System.out.println("do�rulama : "+(result ? "ba�ar�l�":"ba�ar�s�z"));

	}

}
