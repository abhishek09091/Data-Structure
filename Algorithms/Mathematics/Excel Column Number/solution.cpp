int Solution::titleToNumber(string A) {
    
    
int result = 0;
    
   
 for(const auto& C: A)
    {
       
 result *= 26;
        
result += C - 'A' + 1;
    
}
    
    
return result;

}
