package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj="Merhaba Ercan";
		
		int sayi=topla(5,7,4,5,6,7,9);
		String sehir=sehirVer();
		System.out.println(sayi+ " "+sehir);
	}
	
	//metodlar s�n�f�n i�inde ama main fonksiyonunnun d���nda yaz�l�r
	//void fonk==> birsey yapar.
	//
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("G�ncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//veriable arguments ==> birden �ok parametre giri�i yap�labilir 2,3,4,5,5,... gib igibi
	public static int topla(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar)
		{
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}

}
