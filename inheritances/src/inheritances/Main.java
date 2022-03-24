package inheritances;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 =new Customer();
		Employee employee1 =new Employee();
		
		
		EmployeeManager em1=new EmployeeManager();
		CustomerManager cm1=new CustomerManager();
		PersonelManager pm1=new PersonelManager();
		
		//em1.ayinElemani(); gibi toplam 3 fonk çýkar
		//cm1 için 2 fonk çýkar kalýtýmdan dolayý
		//pm1 ise ata örnek olduðu için 2 tane fonk çýkar.
		
	}

}
