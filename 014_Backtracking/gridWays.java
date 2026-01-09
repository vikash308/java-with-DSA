public class gridWays {
    static int findWays(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }else if (i ==m || j==n) {
            return 0;
        } 


        int w1 = findWays(i+1, j, m, n);
        int w2 = findWays(i, j+1, m, n);
        return w1+w2;
    }
    public static void main(String[] args) {
        int m=3, n=3;
        System.out.println(findWays(0, 0, m, n));
    }
}
