

public class friendsPairing {
    static int totalWays(int n){
        if(n==1 || n==2){
            return n;
        }

        int single = totalWays(n-1);
        int pairing = totalWays(n-2);
        int totalPairing = (n-1) * pairing;

        int totalWays = single + totalPairing;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(totalWays(5));
    }
}
