package stringWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj="Bugün hava çok güzel";//char array // bir dizidir char  dizisi 
		String mesaj2="Ercan ÇAKIR";
		String mesaj3="Aralýk MTAL";
		
		System.out.println(mesaj);
		System.out.println("Eleman sayýsý= "+ mesaj.length());
		System.out.println("5. Eleman= "+mesaj.charAt(4));
		
		
		System.out.println(mesaj2+" "+mesaj3); //mesaj2+mesaj3
		System.out.println(mesaj.concat(" ").concat(mesaj3));//mesaj+" "+mesaj3// metin birleþtirme yapar 
		
		System.out.println(mesaj3.startsWith("A"));//mesaj3 A ile baþlýyor mu?
		System.out.println(mesaj3.endsWith("L")); //mesaj3 L ile bitiyor mu?
		
		char [] charArray=new char[5];
		mesaj.getChars(0, 5,charArray, 0);
		System.out.println(charArray);//"Bugün" yazdýrýr
		
		
		System.out.println(mesaj.indexOf("h"));
		// h karakterinin mesajda BAÞTAN kaçýncý indirte olduðunu gösterir ==>6
		System.out.println(mesaj.indexOf("va"));
		// av karakterinin mesajda BAÞTAN kaçýncý indirte olduðunu gösterir ==>8 
		System.out.println(mesaj.lastIndexOf("l"));
		// h karakterinin mesajda SONDAN kaçýncý indirte olduðunu gösterir ==>Sondan Arar
		
		
		String message1="Kocaeli";
		System.out.println(message1.replace("e", "a"));
		// e karaterlerini a karakteri ile deðiþtirir. ==> Kocaali
		//replace ==>karater deðiþtirme
		System.out.println(mesaj.replace(" ", ""));// Boþluklar kaldýrdý
		
		System.out.println(message1.substring(2, 5));// belirli parçayý alýr 2. ,3. , 4. karakteri alýr
		
		for(String word: mesaj.split(" "))// cümleyi kelime kelime yazdýrýr
		{
		System.out.println(word);//kelimeleri yazdýrýr.
		}
		
		System.out.println(mesaj.toLowerCase());//ifadeyi küçük harflerle yazar
		System.out.println(mesaj.toUpperCase());//ifadeyi BÜYÜK harflerle yazar
		
		System.out.println(mesaj.trim()); //mesaj ifadesinin baþýndaki ve sonundaki boþluklarý siler
		
	}

}
