/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */
public class Problem7 {
    
    static int primeGen(int num) {
    	final int size = 500000; // Is there a way we can know what size to use or at least not use as much space?
    	int values[] = new int[size];
    	int numGend = 0;
    	for(int i=0; i<size; i++)
    	{
    		values[i] = i+2;
    		if(values[i] > size)
    			values[i] = 0;
    	}
    	
    	for(int i=2; i<=Math.sqrt(size); i++)
    	{
    		if(values[i-2] != 0) // C++ code is values[i-2 != 0]
    		{
    			for(int j = i*i; j<=size; j+=i)
       				values[j-2] = 0;
    		}
    	}
    	
    	for(int h=0; h<size; h++)
    	{
    		if(values[h] != 0)
    		{
    			numGend++;
    			//System.out.println(values[h] + " ");
                if(numGend == num)
                    return values[h];
    		}
    	}
    	return 0; // 0 Will indicate no primes?
    }
    
    public static void main(String[] args) {
        System.out.println("The 10001st prime is: " + primeGen(10001));
    }
}