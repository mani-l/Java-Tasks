class Cmlineagrs{
  public static void main(String[] args) {

    String str = (args[0]);
    System.out.println("Your name: " +  str);
    
	int age = Integer.parseInt(args[1]);
	System.out.println("Age: " +  age);
		
		if(age >= 18){
		System.out.println(str + " Eligible to vote ");
	}
	else{
		System.out.println(str + " Not Eligible ");
	}
  }
}