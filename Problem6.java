public class Problem6 {

    static int sumOSquare(int num) {
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    } 
    
    static int squareOSum(int num) {
        int sum = 0;       
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return sum*sum;
    }
    
    public static void main(String[] args) {
        
        int sumOSquares = sumOSquare(100);
        int sqaureOSums = squareOSum(100);
        System.out.println(sqaureOSums - sumOSquares);
    }
    
}
