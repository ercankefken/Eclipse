package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] students = {"11s�n�f","deneme", "ercan"};
		// []--> i�areti array (dizi gibi okunur)
		
		String [] ogrenciler= {"ercan","elif","mehmet","hakan"};
		for(int i=0; i<ogrenciler.length;i++)
		{
			System.out.println(i+1 +"-" + ogrenciler[i]);
		}
		
		String [] aylar= {"OCAK","�UBAT","MART","N�SAN","MAYIS","HAZ�RAN","TEMMUZ","A�USTOS","EYL�L","EK�M","KASIM","ARALIK"};
		for(int i=0; i<aylar.length;i++)
		{
			System.out.println(i+1 +"-" + aylar[i]);
		}
		
		System.out.println("******************************");
		
		String [] mevsimler=new String[4]; // dizinin eleman say�s�n�n 4 olaca��n� belirliyoruz
		mevsimler[0]="�lkbahar";
		mevsimler[1]="Yaz";
		mevsimler[2]="Sonbahar";
		mevsimler[3]="K��";
		for(int i=0; i<mevsimler.length;i++)
		{
			System.out.println(i+1 +"-" + mevsimler[i]);
		}
		System.out.println("******************************");
		int i=0;
		for (String mevsim:mevsimler) {
			i++;
			System.out.println(i+"-"+mevsim);// en �ok kullan�lan y�ntem
		}
		
		System.out.println("******************************");
	}

}
