
public class tilingProblem {
    static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int horizontal = tiling(n-2);
        int vertical = tiling(n-1);

        return horizontal + vertical;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
