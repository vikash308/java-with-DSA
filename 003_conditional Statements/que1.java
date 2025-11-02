import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check positive or negative");
        int num = sc.nextInt();

        if(num <0){
            System.out.println(num + "is negative");
        }else{
            System.out.println(num + "is positive");
        }
        sc.close();
    }
}
