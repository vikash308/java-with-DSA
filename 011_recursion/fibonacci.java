
public class fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibn1 = fib(n-1);
        int fibn2 = fib(n-2);

        int fib = fibn1 + fibn2;
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
