public class Mpattern {

	public static void main(String[] args) {
	int n=0,s=0;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==1 || j==9 || (j==n || j==s)&&i<=9/2+1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i==1)
			{
				n=1;
				s=9;
			}
			n++;
			s--;
		}
			
	}

}
