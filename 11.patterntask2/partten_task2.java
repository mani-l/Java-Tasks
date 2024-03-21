import java.util.Scanner;

public class partten_task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur num");	
		int s=sc.nextInt();
		
		
		for (int i = 1; i <= s; i++) {//row
		      for (int j = s; j >=i; j--) {
		        System.out.print("* ");
		      }
		      System.out.println();
}

	}

}
