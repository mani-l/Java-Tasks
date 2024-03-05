public class ReverseArray
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]=new int[a.length];
		int x=a.length-1;
		for(int i=0;i<a.length;i++){
		    if(x>=0){
		    b[i]=a[x];
		    x--;
		    System.out.print(b[i]);
		    }
		    
		}
		    
	}
}

