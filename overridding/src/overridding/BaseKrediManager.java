package overridding;

public class BaseKrediManager  {
 public double hesapla(double tutar) // public FINAL double hesapla(double tutar) 
 //�eklinde yazarsak overriding edilemez.
 {
	return tutar*1.18; 
 }
}
