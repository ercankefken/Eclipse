package classesAttributes;

public class Product {
	
	public Product(int id, String name,String description,int price, int stockAmount) { //constructor sýnýflar... ile çaalýþma
		System.out.println("Yapýcý sýnýf çalýþtý...");
	}
	//ürün özellikleri tanýmlanýr
 private int _id;
 private String _name;
 private String _description;
 private int _price;
 private int _stockAmount;
 private String _kod;
 
//encapsulation iþlemleri kapsülleme getter ve setter ilemleri... 
 public String get_kod() {
	 String Kod=this._name.substring(0,2)+this._id;
	 String buyukKod =Kod.toUpperCase();
	 return buyukKod;
			
}
 /*
public void set_kod(String _kod) {
	this._kod = _kod;
}
*/
//**********************************//
public int get_id() {
	return _id;
}
public void set_id(int id) {
	this._id = id;
}
public String get_name() {
	return _name;
}
public void set_name(String name) {
	this._name = name;
}
public String get_description() {
	return _description;
}
public void set_description(String description) {
	this._description = description;
}
public int get_price() {
	return _price;
}
public void set_price(int price) {
	this._price = price;
}
public int get_stockAmount() {
	return _stockAmount;
}
public void set_stockAmount(int stockAmount) {
	this._stockAmount = stockAmount;
}
 
 
 //private int id; 	//private olduðu için sadece tanýmlandýðý blokta geçerlidir.
//getter setter...
 
}
