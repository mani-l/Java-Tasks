package java_task;

public class CopyArray {
	    public static void main(String[] args) {
	        
	        int num[] = {1,2,3,4,5};
	        for(int i=0; i<num.length;i++) {
	        	System.out.println("orginal num: "+num[i]);
	        }
	        int newnum[] = new int[num.length];

	     for (int i = 0; i < num.length; i++) {
	            newnum[i] = num[i];
	        }
	        for (int i = 0; i < newnum.length; i++) {
	            System.out.println("Copy num: "+newnum[i]);
	        }
	 }
}
