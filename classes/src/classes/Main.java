package classes;

public class Main {// class isimleri PascalCase þeklinde yazýlýr

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class lar ile gruplama yapýyoruz 
		//baþka bir class ý kullanabilmemiz için newl'lemek gerekir
		CostumerManager costumerManager=new CostumerManager();//sýnýflar reerans tipli deðiþkenlerdir
		costumerManager.add();
		costumerManager.remove();
		costumerManager.update();
		
	}

}

