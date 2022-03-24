package mukemmelSayi;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<Integer.MAX_VALUE;i++)
		{
			int total=0;
			for(int j=1;j<i;j++)
			{
				
				if(Math.floorMod(i, j)==0)
				{
					total+=j;
				}
			}
			if (total==i)
			{
				System.out.println(i);
			}
		}	
	}
}
