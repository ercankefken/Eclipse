package oOOPIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Product  product1=new Product(3,"HP",12000,"32 GB Ram"); //örnek-referans oluþturma iþlemi
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=15000;
		product1.detail="16 GB Ram";
		
		Product  product2=new Product(); //örnek-referans oluþturma iþlemi
		product2.id=2;
		product2.name="Lenovo V16";
		product2.unitPrice=9000;
		product2.detail="8 GB Ram";
		
		Product  product3=new Product(); //örnek-referans oluþturma iþlemi
		product3.id=3;
		product3.name="Apple";
		product3.unitPrice=23000;
		product3.detail="16 GB Ram";
		
		
		Product [] products= new Product[]{product1,product2,product3};
		for (Product product : products) {
			
			System.out.println(product.name);
			System.out.println(product.id);
			System.out.println(product.unitPrice);
			System.out.println(product.detail);
			System.out.println("***************************");
		}
		System.out.println(products.length);
		
		
		Category cat1= new Category();
		cat1.id=1;
		cat1.name="Dizüstü Bilgisayar";
		
		Category cat2= new Category();
		cat2.id=2;
		cat2.name="Ev/Bahçe";
		
		Category[] category=new Category[] {cat1, cat2};
		
		
		ProductManager productManager= new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		
		
		
		
		
	}

}
