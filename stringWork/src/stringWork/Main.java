package stringWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj="Bug�n hava �ok g�zel";//char array // bir dizidir char  dizisi 
		String mesaj2="Ercan �AKIR";
		String mesaj3="Aral�k MTAL";
		
		System.out.println(mesaj);
		System.out.println("Eleman say�s�= "+ mesaj.length());
		System.out.println("5. Eleman= "+mesaj.charAt(4));
		
		
		System.out.println(mesaj2+" "+mesaj3); //mesaj2+mesaj3
		System.out.println(mesaj.concat(" ").concat(mesaj3));//mesaj+" "+mesaj3// metin birle�tirme yapar 
		
		System.out.println(mesaj3.startsWith("A"));//mesaj3 A ile ba�l�yor mu?
		System.out.println(mesaj3.endsWith("L")); //mesaj3 L ile bitiyor mu?
		
		char [] charArray=new char[5];
		mesaj.getChars(0, 5,charArray, 0);
		System.out.println(charArray);//"Bug�n" yazd�r�r
		
		
		System.out.println(mesaj.indexOf("h"));
		// h karakterinin mesajda BA�TAN ka��nc� indirte oldu�unu g�sterir ==>6
		System.out.println(mesaj.indexOf("va"));
		// av karakterinin mesajda BA�TAN ka��nc� indirte oldu�unu g�sterir ==>8 
		System.out.println(mesaj.lastIndexOf("l"));
		// h karakterinin mesajda SONDAN ka��nc� indirte oldu�unu g�sterir ==>Sondan Arar
		
		
		String message1="Kocaeli";
		System.out.println(message1.replace("e", "a"));
		// e karaterlerini a karakteri ile de�i�tirir. ==> Kocaali
		//replace ==>karater de�i�tirme
		System.out.println(mesaj.replace(" ", ""));// Bo�luklar kald�rd�
		
		System.out.println(message1.substring(2, 5));// belirli par�ay� al�r 2. ,3. , 4. karakteri al�r
		
		for(String word: mesaj.split(" "))// c�mleyi kelime kelime yazd�r�r
		{
		System.out.println(word);//kelimeleri yazd�r�r.
		}
		
		System.out.println(mesaj.toLowerCase());//ifadeyi k���k harflerle yazar
		System.out.println(mesaj.toUpperCase());//ifadeyi B�Y�K harflerle yazar
		
		System.out.println(mesaj.trim()); //mesaj ifadesinin ba��ndaki ve sonundaki bo�luklar� siler
		
	}

}
