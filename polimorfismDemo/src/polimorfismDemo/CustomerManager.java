package polimorfismDemo;
	

public class CustomerManager {
	
	private BaseLogger logger;
	public CustomerManager( BaseLogger logger)
	{
		this.logger=logger;
	}
	public void Add() {
		System.out.println("Müsteri Eklendi");
		
		this.logger.Log("Loglama Yapýldý ");
	}
}
