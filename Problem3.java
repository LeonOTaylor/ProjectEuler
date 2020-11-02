/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

public class Problem3 {

    static boolean isPrime(long num) {
        int divCnt = 1;
        // We only have to calulate up to the sqrt of num but itll probably just as long
        for(long i=1; i <= Math.sqrt(num); i++) 
        { 
            if(num % i == 0) 
                divCnt++;
            else
                continue;
        }
        
        if(divCnt == 2)
        	return true;
        else
        	return false;
    }
    
    public static void main(String[] args) {
        long number = 600851475143L;
        
        for(long i=2; i<=Math.sqrt(number); i++){
            if(isPrime(i) == true && number % i == 0)
                System.out.println(i);
        }
    }
    
}