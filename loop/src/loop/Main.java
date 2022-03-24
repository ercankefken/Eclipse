package loop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for
		for(int i=0; i<=10;i+=2)
		{
			System.out.println(i);
		}
		System.out.println("Döngü Bitti...");
		
		// while döngüsü
		int i =1;
		while(i<10)
		{
			System.out.println(i);
			i+=2;
			
		}
		System.out.println("While Döngüsü Bitti...");
		
		//do_while döngüsü
		int x=0;
		do
		{
			System.out.println(x);
			x++;
		}while(x<10);
		System.out.println("do while döngüsü Bitti...");
	}

}
