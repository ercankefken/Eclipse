package buyukSayiyiBul;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1=16;
		int sayi2=15;
		int sayi3=16;
		int eb=sayi1;
		
		if(eb<sayi2)
		{
			eb=sayi2;
		}
		else if(eb<=sayi3)
		{
			eb=sayi3;
		}
		else if (sayi2 < sayi3)
		{
			eb=sayi3;
		}
		System.out.println("En Büyük Sayý :"+eb);
	}

}
