public class checkEvenOrOdd {
    public static void checkNumber(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        checkNumber(23);
        checkNumber(2);
        checkNumber(3);
        checkNumber(9);
    }
}