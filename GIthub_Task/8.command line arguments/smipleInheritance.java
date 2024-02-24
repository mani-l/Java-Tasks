class One{
   public static int a= 10;
  
  public static void printname(){
       System.out.println("Name : Mani");
   }
}

public class Main extends One{
    


	public static void main(String[] args) {
		printname();
		System.out.println("Age : " + a);
	    
	}
}

