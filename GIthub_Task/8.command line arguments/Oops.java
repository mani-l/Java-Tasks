class One{
   public static int a= 21;
  
  public static void printname(){
       System.out.println("Name : Mani");
   }
}

public class Oops extends One{
   
   public static void main(String[] args) {
		printname();
		System.out.println("Age : " + a);
	    
	}
}

