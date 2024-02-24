class One{
   public static int a= 10;
 }
 
class Two extends One{ 
  public static void printname(){
       System.out.println("Name : Mani");
   }
}

public class Main extends Two{
    


	public static void main(String[] args) {
		printname();
		System.out.println("Age : " + a);
	    
	}
}

