package sat_sunday_practise;

public class Shan {
	
	Shan()
  	{
		System.out.println("I am a constructor");
	}
	
	static void Addition() 
	{
		System.out.println("I am static method");
	}
	void Sub() 
	{
		System.out.println("I am Non static method");
	}

	public static void main(String[] args)
	{
		Addition();
		Shan s1=new Shan();
		s1.Sub();
		//s1.Shan();
		// need to learn

	}

}
