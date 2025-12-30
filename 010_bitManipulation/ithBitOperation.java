public class ithBitOperation {
    public static int getBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask)== 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateBit(int n, int i, int newBit){
        n = clearBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    
    public static int clearIBit(int n, int i ) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    
    public static int clearIBitsRange(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b= 1<<(i-1);
        int bitMask = a|b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(getBit(13, 1));
        System.out.println(setBit(13, 1));
        System.out.println(clearBit(13, 2));
        System.out.println(clearIBit(13, 2));
        System.out.println(updateBit(13, 1, 1));
        System.out.println(clearIBitsRange(10, 2, 4));
    }
}
