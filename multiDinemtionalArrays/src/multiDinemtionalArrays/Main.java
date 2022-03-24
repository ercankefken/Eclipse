package multiDinemtionalArrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] sehirler=new String[3][3];
		sehirler[0][0]="Ýstanbul";
		sehirler[0][1]="Kocaeli";
		sehirler[0][2]="Bursa";
		sehirler[1][0]="Van";
		sehirler[1][1]="Kars";
		sehirler[1][2]="Muþ";
		sehirler[2][0]="Mardin";
		sehirler[2][1]="Kilis";
		sehirler[2][2]="Siirt";
		
		for(int i=0; i<sehirler.length; i++)
		{
			for(int j=0; j<sehirler.length; j++)
			{
				System.out.println(sehirler[i][j]);
			}
		}
		
		
	}

}
