package ilkuygulama1;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//deðiþkenler
		//camelCase yazýmý
		String internetSubeButonu="Ýnternet Þubesi";
		
		double dolarDun=8.15;
		double dolarBugun=8.15;
		
		byte vadeBilgisi=12;
		int vadeBilgisiOrta=500;
		long vadeBilgisiUzun=1223424133;
		
		boolean dolarDurumDuneGoreArtis=true;
		if(dolarDun<dolarBugun)
		{
			System.out.println("Dolar arttý resmi");
			//dolarDurumDuneGoreArtis=true;
			//System.out.println("Dolar Artmýþ Resmi Göster="+ dolarDurumDuneGoreArtis);
		}
		else if(dolarDun>dolarBugun)
		{
			System.out.println("Dolar düþtü resmi");
			//dolarDurumDuneGoreArtis=false;
			//System.out.println("Dolar Düþtü Resmi Göster="+ dolarDurumDuneGoreArtis);
		}
		else
		{
			System.out.println("Dolar eþittir resmi");
		}
		
		System.out.println("Ercan ÇAKIR'ýn ilk java uygulamasý");
		System.out.println(internetSubeButonu);
		
		
		String[] krediler= {
				"Taþýt Kredisi",
				"Konut Kredisi",
				"Ýhtiyaç Kredisi",
				"Çiftçi Kredisi"};
		
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
