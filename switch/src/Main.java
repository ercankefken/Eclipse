
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SWITCH Tek Durumlu Dallanmalar i�in kullan�l�r...
		char harfnotu='A';
		 switch (harfnotu)
		 {
		 case 'A': System.out.println("M�kemmel"); break;
		 case 'B': System.out.println("�ok �yi"); break;
		 case 'C': System.out.println("�yi"); break;
		 case 'D': System.out.println("Ge�er"); break;
		 case 'F': System.out.println("Kald�"); break;
		 default:System.out.println("Ge�erli Bir Not De�il");
		 }
		 
		 int kacincigun=3;
		 switch(kacincigun)
		 {
		 case 1: System.out.println("Pazartesi"); break;
		 case 2: System.out.println("Sal�"); break;
		 case 3: System.out.println("�ar�amba"); break;
		 case 4: System.out.println("Per�embe"); break;
		 case 5: System.out.println("Cuma"); break;
		 case 6: System.out.println("Cumartesi"); break;
		 case 7: System.out.println("Pazar"); break;
		 default:System.out.println("Ge�erli Bir G�n De�il");
		 }
	}

}
