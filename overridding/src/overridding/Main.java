package overridding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//System.out.println(ogretmenKrediManager.hesapla(100));
		
		BaseKrediManager[] krediManagers=new BaseKrediManager[] 
				{new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};
		for(BaseKrediManager krediManager:krediManagers)
		{
			System.out.println(krediManager.hesapla(1000));
		}
	}

}
