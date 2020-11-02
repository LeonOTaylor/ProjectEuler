public class Problem12 {
    
    public static void main(String[] args) {
    	long count = 0, theNumba=0;
        int divisors=0, sqrter=0;
        
        while(divisors < 500){
            count++;
            theNumba += count;
            divisors=0;
            sqrter = (int) Math.sqrt(theNumba);
            
            for(int j=1; j<=sqrter; j++) 
            {
            	if(theNumba % j == 0)
            		divisors+=2;
            }
            
            if(theNumba == sqrter*sqrter)
            	divisors--;
            
        }
        System.out.println("The numba is: " + theNumba);
    }
    
}
