package asalSayiMi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=-1;
		int degisen=sayi-1;
		boolean asalmi=true;
		if(sayi>1)
		{
			for(;1<degisen;degisen--)
			{
				//kalan = (sayi/(degisen-1));
				if(Math.floorMod(sayi, degisen)==0)
				{
					asalmi=false;
					break;
				}
				else
				{
					asalmi=true;
				}			
			}
			if(asalmi==false)
				System.out.println("Sayý Asal Deðildir");
			else
				System.out.println("Sayý Asaldýr");
		}
		else
			System.out.println("Sayý Asal Deðildir");
		}
}
