package inheritancesDemo;

public class InheritancesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OgretmenKrediManeger ogretmenKrediManeger=new OgretmenKrediManeger();
		ogretmenKrediManeger.hesapla();
		TarimKrediManager tarimKrediManager=new TarimKrediManager();
		tarimKrediManager.hesapla();
		
		KrediUI krediUI=new KrediUI();
		krediUI.krediHesapla(ogretmenKrediManeger);
		// krediUI.krediHesapla(new OgretmenKrediManeger()); 
		//yukarıdaki satır ile aynı işi yapar
		
		AskerKrediManager askerKrediManager =new AskerKrediManager();
		askerKrediManager.hesapla();
		
		krediUI.krediHesapla(new AskerKrediManager());// yukarısı ile aynı işi yapar
	}

}
