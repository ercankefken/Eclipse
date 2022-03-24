package polimorfismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseLogger [] loggers=new BaseLogger[] {new FileLoger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		// yukarýdaki kullanýmý kalýtým sayesinde yapabiliyoruz.
		for(BaseLogger logger:loggers)
		{
			logger.Log("Log Mesajý Verildi");
		}
		
		
		
		//yeni tarzý 
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.Add(); 
	}

}
