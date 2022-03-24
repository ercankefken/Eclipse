
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SWITCH Tek Durumlu Dallanmalar için kullanýlýr...
		char harfnotu='A';
		 switch (harfnotu)
		 {
		 case 'A': System.out.println("Mükemmel"); break;
		 case 'B': System.out.println("Çok Ýyi"); break;
		 case 'C': System.out.println("Ýyi"); break;
		 case 'D': System.out.println("Geçer"); break;
		 case 'F': System.out.println("Kaldý"); break;
		 default:System.out.println("Geçerli Bir Not Deðil");
		 }
		 
		 int kacincigun=3;
		 switch(kacincigun)
		 {
		 case 1: System.out.println("Pazartesi"); break;
		 case 2: System.out.println("Salý"); break;
		 case 3: System.out.println("Çarþamba"); break;
		 case 4: System.out.println("Perþembe"); break;
		 case 5: System.out.println("Cuma"); break;
		 case 6: System.out.println("Cumartesi"); break;
		 case 7: System.out.println("Pazar"); break;
		 default:System.out.println("Geçerli Bir Gün Deðil");
		 }
	}

}
