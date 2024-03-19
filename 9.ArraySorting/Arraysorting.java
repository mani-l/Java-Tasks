public class Arraysorting
{
	public static void main(String[] args) {
       //array diclar
       int a[] ={9,22,6,18,28,1,12};
       System.out.println("orginal arr : ");
       for(int i=0;i<a.length;i++)
       System.out.print(a[i]+ " ");
       
       //sorting array
       int temp =0;
       for (int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[j]< a[i]){
                   temp =a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
       }
       System.out.println("\nsorted arr: "); 
       for(int i=0;i<a.length;i++)
       System.out.print(a[i]+" "); 
	}
}
