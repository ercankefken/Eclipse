package arraysapp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total=0.0;
		double eb=0.0;
		//double [] myList= new double[4];
		double [] myList= {3.6 ,235.6, 46.8, 98.8};
		
		for(double myNumber:myList) 
		{System.out.println(myNumber); total+=myNumber;
		if(myNumber>eb)
			{eb=myNumber;}
		}
		System.out.println("Say�lar�n Toplam�= "+total);
		System.out.println("Say�lar�n En B�y���= "+eb);
		
	}

}
