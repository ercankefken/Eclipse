package overridding;

public class OgretmenKrediManager extends BaseKrediManager{
	 public double hesapla(double tutar) // overriding işlemi yapıldı...
	 {
		return tutar*1.50; 
	 }

}
