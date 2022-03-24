package oOOPIntro;

public class Product {
	//constructor 1 kez çalýþýr
	public Product()//constructor (yapýcý) fonksiyon
	{
		// bunu biz yazmasakta bu hep var 
		//her zaman çalýþýr
		System.out.println("Nesne oluþtu");

		
	}
	public Product(int id, String name,double unitPrice, String detail)//constructor (yapýcý) fonksiyon
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
