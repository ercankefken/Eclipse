package classesAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1=new Product(2,"Hp","16gb Ram",1233,12);//alttaki sat�rlar�n yerini al�r
		//parametreli constructer tan�mlad���m�z i�in b�yle kullanabiliriz.
		
		//product1.set_id(12);
		//product1.set_name("Diz�st� Bilgisayar");
		//product1.set_description("Asus R15");
		//product1.set_price(13400);
		//product1.set_stockAmount(12);
		//System.out.println(product1.name);// name yazd�r�r.
		
		ProductManager productManager =new ProductManager();
		productManager.productAdd(product1);
		 System.out.println(product1.get_kod());
		 
	}

}
