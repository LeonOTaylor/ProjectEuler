/**
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */

public class Problem10 {
    
    public static void main(String[] args) {
        int maxVal = 2000000;
        int[] values = new int[maxVal];
        long sum = 0;
        
        for(int i=0; i<maxVal; i++)
        {
            values[i] = i+2;
            if(values[i] > maxVal)
                values[i]=0;
        }
        
        for(int i=2; i<=Math.sqrt(maxVal); i++)
        {
        	if(values[i-2] != 0)
        		for(int j = i*i; j<=maxVal; j+=i)
                {
                    values[j-2] = 0;
                }
        }
        
        for(int h=0; h<maxVal; h++)
        {
            if(values[h] != 0)
                sum += values[h];
        }
        
        values = null;
        
        System.out.println("Sum of primes is: " + sum);
    }
    
}