string Solution::convertToTitle(int a) {
   
 
char A = 'A'; 

string s="";

while(a>0){

a--;

int t = a%26;

char ct = t+A;

s = ct +s;

a = a/26;

}

return s;
    
   
 
}
