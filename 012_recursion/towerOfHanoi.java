public class towerOfHanoi {
        static void towerHanoi(int n, char from, char to, char by){
            if(n==0){
                return ;
            }

            towerHanoi(n-1, from, by, to);
            System.out.println("transfer disk " + n + " from " + from + " to " + to);
            towerHanoi(n-1, by, to, from);
        }
    public static void main(String[] args) {
        towerHanoi(3, 'a', 'b', 'c');
    }
}
