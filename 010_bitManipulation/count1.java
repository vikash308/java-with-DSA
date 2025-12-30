public class count1 {
    public static int count(int n){
        int count =0;
        int bitMask =1;
        while(n!=0){
            if((n & bitMask) == 1){
                count++;
            }
            n= n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count(10));
    }
}
