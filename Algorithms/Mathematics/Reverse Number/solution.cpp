int Solution::reverse(int A) {
   
   bool check = false;
   long temp = A;
   if(temp<0)
   {
        temp = 0 - temp;
        check = true;
   }
   
   long rev_num=0;
   
   while(temp>0)
   {
       rev_num = rev_num*10+temp%10;
       temp=temp/10;
   }
   
   if(rev_num>INT_MAX) return 0;
   if(check==true)
   {
       return 0-((int)rev_num);
   }
   
   return (int)rev_num;
   
}
