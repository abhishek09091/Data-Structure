vector<string> Solution::fizzBuzz(int A) {
 
        vector<string> vec;
        for(int i=1; i<=A; i++)
        {
            if(i%15==0)
            {
                vec.push_back("FizzBuzz");
            }
            else if(i%3==0)
            {
                vec.push_back("Fizz");
            }
            else if(i%5==0)
            {
                vec.push_back("Buzz");
            }
            else
            {
                vec.push_back(std::to_string(i));
            }
        }
 
        return vec;
}
 