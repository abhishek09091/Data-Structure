public class Solution {
  
public static ArrayList<Integer> primesum(int A) {
  
      ArrayList<Integer> result = new ArrayList<Integer>();

        if(A < 2)
          
	  return result;
        

        int first = 2;
      
        int second = A - first; 
 
        while(first <= second){
    
            second = A - first;
   
         if(isPrime(second) == true && isPrime(first)){
       
         result.add(first);
       
         result.add(second);
       
         return result;
      
      }
          
         first++;
   
     }
        
     
   return result;
    
}
    
  
   public static boolean isPrime(int n){
        
 
       if(n == 2) return true;
    
       if(n % 2 == 0)
   return false;
   
       for(int i = 2; i < n; i++){
      
       if(n % i == 0)
           
         return false;
   
     }
      
   return true;
   
 }   
		 

}