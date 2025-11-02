import java.util.Scanner;

public class loop_que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact =1;
        System.out.println("enter number for find factorial");
        num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            fact = fact* i;
        }
        System.out.println("factorial is " + fact);
    }
}
