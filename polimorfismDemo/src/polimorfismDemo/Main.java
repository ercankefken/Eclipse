package polimorfismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseLogger [] loggers=new BaseLogger[] {new FileLoger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		// yukar�daki kullan�m� kal�t�m sayesinde yapabiliyoruz.
		for(BaseLogger logger:loggers)
		{
			logger.Log("Log Mesaj� Verildi");
		}
		
		
		
		//yeni tarz� 
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.Add(); 
	}

}
