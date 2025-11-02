import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length and breadth of a square");
        int length= sc.nextInt();
        int breadth = sc.nextInt();
        int Area  = length * breadth;
        System.out.println("Area is : "+ Area);
        sc.close();
    }
}
