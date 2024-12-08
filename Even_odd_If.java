package sat_sunday_practise;

public class Even_odd_If 
{
	
	void addition() 
	
		{
			int a=5;
			if(a%2==0) 
			{ 
				System.out.println(a + " is even Number ");
			}
			else
			{
				System.out.println(a + " is odd number");
			}
		 }
	
	
public static void main(String[] args) 
{ 
	Even_odd_If Non_static=new Even_odd_If();
	Non_static.addition();
}

  
}
 