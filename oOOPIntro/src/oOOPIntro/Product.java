package oOOPIntro;

public class Product {
	//constructor 1 kez �al���r
	public Product()//constructor (yap�c�) fonksiyon
	{
		// bunu biz yazmasakta bu hep var 
		//her zaman �al���r
		System.out.println("Nesne olu�tu");

		
	}
	public Product(int id, String name,double unitPrice, String detail)//constructor (yap�c�) fonksiyon
	{

		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
	}
	String name;
	int id;
	double unitPrice;
	String detail;
	

}
