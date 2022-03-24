package numberFind;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar=new int[] {1,5,65,34,78,15,98};
		int searchNumber=34;
		boolean areThere=false;
		
		//for(int i=0;i<sayilar.length;i++)
		for(int sayi:sayilar)
		{
			if(searchNumber==sayi)
			{
				areThere=true;
			}
		}
		if(areThere==true)
		{
			System.out.println(searchNumber+  " dizinin içerisinde var");
		}
		else
		{
			System.out.println(searchNumber+  " dizinin içerisinde yok");
		}
	}

}
