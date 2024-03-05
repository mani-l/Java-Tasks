public class Maximum{
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};
        int max=0;
        for(int i=0;i<numbers.length;i++){
           
                if (max<numbers[i]){
                    max=numbers[i];
                }
            }
        
       
         System.out.println(max);
    }
}

