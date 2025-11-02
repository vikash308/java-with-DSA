import java.util.Scanner;

public class loop_que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for multiplication table");
        int table = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(table +" * "+i+ " = " + (table*i));
        }
    }
}
