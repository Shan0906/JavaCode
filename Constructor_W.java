package sat_sunday_practise;

public class Constructor_W 
{   int Car_year;
    String Car_name;
    
    Constructor_W(int year,String name)
    {  Car_year=year;
        Car_name=name;
    	
    }
public static void main(String[] args) 
  {
	Constructor_W m1=new Constructor_W(1969,"Mustang");
	
	System.out.println("My car modified in "+m1.Car_year +"  name is "+m1.Car_name);
  }
}
