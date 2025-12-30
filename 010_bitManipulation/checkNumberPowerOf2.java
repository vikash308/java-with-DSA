public class checkNumberPowerOf2 {
    public static void checkNum(int n){
        if((n&(n-1))== 0){
            System.out.println("number is power of 2");
        }else{
            System.out.println("number is not power of 2");
        }
    }
    public static void main(String[] args) {
        checkNum(15);
    }
}
