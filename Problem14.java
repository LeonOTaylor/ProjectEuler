// Could be optimized? Runs reasonably fast but idk if javac has made some optimization
// I just remember it being really slow
public class Problem14 {
    
    public static long colatzSeq(long num) {
        long numOTerms = 0;
        while(num != 1) {
            numOTerms++;
            //System.out.println(num);
            if(num%2==0) // If num is even,
                num = num / 2; // divide it by 2
            else if(num%2 != 0) // If num is odd,
                num = 3*num + 1; // do this shiz
            
            
    }
        return numOTerms;
    }
    
    public static void main(String[] args) {
        long biggestChain = 0; //Forogt how to convert int to long, will do
        for(int i=1; i<=1000000; i++) {
            //System.out.println(i);
            if(colatzSeq(i) > biggestChain) {
                biggestChain = colatzSeq(i);
                System.out.println(i + " has " + biggestChain + " terms");
            }
            //System.out.println("Num of terms: " + );
        }
        //System.out.println("The stuck 1: " + colatzSeq(113383));
    }
}