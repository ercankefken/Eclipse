package polimorfismDemo;
	

public class CustomerManager {
	
	private BaseLogger logger;
	public CustomerManager( BaseLogger logger)
	{
		this.logger=logger;
	}
	public void Add() {
		System.out.println("M�steri Eklendi");
		
		this.logger.Log("Loglama Yap�ld� ");
	}
}
