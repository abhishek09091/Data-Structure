import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
 
public class Solution {
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
 
	 public static Map<Integer,Integer> map ;
	 public static void makeList(Integer number)
	 {
		map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 0);
		for(int i=2;i<number+1;i++)
		{
			map.put(i, 1);
		}
 
		 for(Integer i=2; i*i<=number; i++)
		 {
			 if(map.get(i)==1)
			 {
				 for(Integer j=i*2; j<=number; j=j+i)
				 {
					 map.put(j, 0);
				 }
			 }
		 }
		 //System.out.println(map);
 
	 }
 
	 public static boolean isPrime(Integer number)
	 {
		 if(map.get(number)==1)
		 {
			 return true;
		 }
 
		 return false;
	 }
	 public static ArrayList<Integer> primesum(Integer A)
	 {
 
		 ArrayList<Integer> result = new ArrayList<>();
 
		 if(A<2)
			 return result;
 
		 makeList(A);
 
		 Integer first = 2;
		 Integer second = A - first;
		 while(first<=second)
		 {
			second = A - first;
			if(isPrime(second)==true && isPrime(first))
			{
				result.add(first);
				result.add(second);
				return result;
			}
 
			first++;
		 }
 
		 return result;
 
	 }
 
 
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		FastReader sc = new FastReader();
		Integer number = sc.nextInt();
		ArrayList<Integer> result = primesum(number);
		System.out.println(result);
		long endTime  = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
 
}