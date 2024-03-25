import java.util.Scanner;
import java.util.Arrays;

public class Kthelement {

	public static int kthelement(int[] arr, int k){
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your num: ");	
	int k = sc.nextInt();
		
		int[]a = new int[] {6,10,8,9,1,5};
		//{1,5,6,8,9,10}
		System.out.println(kthelement(a,k));
		
	      
	}
}