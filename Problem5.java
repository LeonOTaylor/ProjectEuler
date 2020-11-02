/**
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public static void main(String[] args) {
        long iter = 1L;
        int sumOfDiv = 0;
        boolean foundit = false;
        
        while(!foundit) {
            for(int i=1; i <= 20; i++) {
                sumOfDiv += iter%i;
            }
            
            if(sumOfDiv == 0) {
                System.out.println("The number is " + iter);
                foundit = true;
                break;
            } else {
                sumOfDiv=0;
                iter++;
            }
        }
    }
    
}
