package overridding;

public class OgretmenKrediManager extends BaseKrediManager{
	 public double hesapla(double tutar) // overriding i�lemi yap�ld�...
	 {
		return tutar*1.50; 
	 }

}
