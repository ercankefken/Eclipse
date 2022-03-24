package iinceKalinSesli;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mevcut örnek switch ile yapýlabilir
		char harf='r';
		if(harf=='A'||harf=='a'||harf=='U'||harf=='u'||harf=='I'||harf=='ý'||harf=='O'||harf=='o')
		
			System.out.println("Kalýn sesli bir harftir...");
		else if(harf=='E'||harf=='e'||harf=='Ý'||harf=='i'||harf=='Ü'||harf=='ü'||harf=='Ö'||harf=='ö')
			System.out.println("Ýnce sesli bir harftir...");
		else
			System.out.println("Geçersiz Bir Harf Giriþi Yapýlmýþtýr...");
	}

}
