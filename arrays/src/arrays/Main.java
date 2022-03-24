package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] students = {"11sýnýf","deneme", "ercan"};
		// []--> iþareti array (dizi gibi okunur)
		
		String [] ogrenciler= {"ercan","elif","mehmet","hakan"};
		for(int i=0; i<ogrenciler.length;i++)
		{
			System.out.println(i+1 +"-" + ogrenciler[i]);
		}
		
		String [] aylar= {"OCAK","ÞUBAT","MART","NÝSAN","MAYIS","HAZÝRAN","TEMMUZ","AÐUSTOS","EYLÜL","EKÝM","KASIM","ARALIK"};
		for(int i=0; i<aylar.length;i++)
		{
			System.out.println(i+1 +"-" + aylar[i]);
		}
		
		System.out.println("******************************");
		
		String [] mevsimler=new String[4]; // dizinin eleman sayýsýnýn 4 olacaðýný belirliyoruz
		mevsimler[0]="Ýlkbahar";
		mevsimler[1]="Yaz";
		mevsimler[2]="Sonbahar";
		mevsimler[3]="Kýþ";
		for(int i=0; i<mevsimler.length;i++)
		{
			System.out.println(i+1 +"-" + mevsimler[i]);
		}
		System.out.println("******************************");
		int i=0;
		for (String mevsim:mevsimler) {
			i++;
			System.out.println(i+"-"+mevsim);// en çok kullanýlan yöntem
		}
		
		System.out.println("******************************");
	}

}
