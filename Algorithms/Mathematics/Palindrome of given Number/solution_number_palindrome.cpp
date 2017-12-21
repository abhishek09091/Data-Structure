bool Solution::isPalindrome(int num) {
    
    int temp = num;
    int rev_num = 0;
    while(num > 0)
    {
        rev_num = rev_num*10 + num%10;
        num = num/10;
    }
    
    if(temp == rev_num)
        return true;
    
    return false;
        
}
