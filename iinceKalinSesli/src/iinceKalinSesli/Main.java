package iinceKalinSesli;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mevcut �rnek switch ile yap�labilir
		char harf='r';
		if(harf=='A'||harf=='a'||harf=='U'||harf=='u'||harf=='I'||harf=='�'||harf=='O'||harf=='o')
		
			System.out.println("Kal�n sesli bir harftir...");
		else if(harf=='E'||harf=='e'||harf=='�'||harf=='i'||harf=='�'||harf=='�'||harf=='�'||harf=='�')
			System.out.println("�nce sesli bir harftir...");
		else
			System.out.println("Ge�ersiz Bir Harf Giri�i Yap�lm��t�r...");
	}

}
