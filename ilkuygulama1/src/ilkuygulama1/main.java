package ilkuygulama1;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//de�i�kenler
		//camelCase yaz�m�
		String internetSubeButonu="�nternet �ubesi";
		
		double dolarDun=8.15;
		double dolarBugun=8.15;
		
		byte vadeBilgisi=12;
		int vadeBilgisiOrta=500;
		long vadeBilgisiUzun=1223424133;
		
		boolean dolarDurumDuneGoreArtis=true;
		if(dolarDun<dolarBugun)
		{
			System.out.println("Dolar artt� resmi");
			//dolarDurumDuneGoreArtis=true;
			//System.out.println("Dolar Artm�� Resmi G�ster="+ dolarDurumDuneGoreArtis);
		}
		else if(dolarDun>dolarBugun)
		{
			System.out.println("Dolar d��t� resmi");
			//dolarDurumDuneGoreArtis=false;
			//System.out.println("Dolar D��t� Resmi G�ster="+ dolarDurumDuneGoreArtis);
		}
		else
		{
			System.out.println("Dolar e�ittir resmi");
		}
		
		System.out.println("Ercan �AKIR'�n ilk java uygulamas�");
		System.out.println(internetSubeButonu);
		
		
		String[] krediler= {
				"Ta��t Kredisi",
				"Konut Kredisi",
				"�htiya� Kredisi",
				"�ift�i Kredisi"};
		
		//foreach
		for(String kredi: krediler)
		{
			System.out.println(kredi);
		}
		System.out.println("**********************************");
		for(int i=0;i<krediler.length; i++) 
		{
			System.out.println(krediler[i]);
		}
		System.out.println("**********************************");

		
	}

}
