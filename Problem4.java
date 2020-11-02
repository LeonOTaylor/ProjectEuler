/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {

    static boolean palcheck(int num) {
        int lastdigit=0, flipped=0, numclone = num;
        
        while(num > 0) {
            lastdigit = num % 10;
            flipped = flipped * 10 + lastdigit;
            num /= 10;
        }
        
        if(numclone == flipped)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
    	int bigger = 0;
        for(int i=1; i<=999; i++) {
            for(int k=1; k<=999; k++) {
                if(palcheck(i*k) == true) {
                    if(i*k > bigger)
                        bigger = i*k;
                }
            }
        }
        System.out.println(bigger);
    }
    
}
