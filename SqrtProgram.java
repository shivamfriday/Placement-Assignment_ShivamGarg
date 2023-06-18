public class SqrtProgram{
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        
        int sqrt = x;

        while (true) {
           
            sqrt = (sqrt + x / sqrt) / 2;

           
            if (sqrt * sqrt <= x && x < (sqrt + 1) * (sqrt + 1)) {
                return sqrt;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));   
        System.out.println(mySqrt(8));  
        System.out.println(mySqrt(9));  
        System.out.println(mySqrt(230)); 
    }
}
