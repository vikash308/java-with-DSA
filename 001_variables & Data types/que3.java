import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pen");
        int pen = sc.nextInt();
        System.out.println("enter the price of pencil");
        int pencil = sc.nextInt();
        System.out.println("enter the price of eraser");
        int eraser = sc.nextInt();
        int total = pen +pencil + eraser;
        int gst = total * 18/100;
        System.out.println("your total bill is :"+ total);
        System.out.println("your total bill with gst is :"+ (total+gst));
        sc.close();
    }
}
