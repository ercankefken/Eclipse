package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2, int sayi3)
	{
		return sayi1+sayi2+sayi3;
	}
	
	//her 2 topla fonk i�in overloading uyguland�
	
	
	public int topla(int sayi1, int sayi2)
	{
		return sayi1+sayi2;
	}
	


}
