package classes;

public class Main {// class isimleri PascalCase �eklinde yaz�l�r

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class lar ile gruplama yap�yoruz 
		//ba�ka bir class � kullanabilmemiz i�in newl'lemek gerekir
		CostumerManager costumerManager=new CostumerManager();//s�n�flar reerans tipli de�i�kenlerdir
		costumerManager.add();
		costumerManager.remove();
		costumerManager.update();
		
	}

}

