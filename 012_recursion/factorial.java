
public class factorial {
    static int findFactorial(int n){
        if(n<=1){
            return 1;
        }
        int fact = n * findFactorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("factorial is " + findFactorial(6));
    }
}
