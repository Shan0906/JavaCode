package sat_sunday_practise;

public class String_Practise2 {

	public static void main(String[] args) 
	{

       String s1=("Shantanu Mohod");
       System.out.println(s1.replace('a', '5'));
       System.out.println(s1.replace("Mohod", "Vijay"));
       System.out.println(s1.replace("a", ""));
       
      System.out.println("--------------------------------------------------------------------------------"); 
      
       String s2=("Shantanu09Vijay06Mohod2001");
       System.out.println(s2.replaceAll("[0-9]",""));
       System.out.println(s2.replaceAll("[A-Z]",""));
       System.out.println(s2.replaceAll("[a-z]",""));
       
       System.out.println("--------------------------------------------------------------------------------"); 
       
       String s3=("Tanu");
       System.out.println(s3.matches("...."));
       System.out.println(s3.matches("T(.*)"));
       System.out.println(s3.matches("(.*)u"));
       System.out.println(s3.matches("(.*)n(.*)"));
       
       System.out.println(s3.repeat(2));
       System.out.println(s1.lastIndexOf('o'));

	}

}
