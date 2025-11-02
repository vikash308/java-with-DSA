import java.util.Scanner;

public class loop_que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, choice =1, evenSum=0, oddSum=0;
        while(choice==1){
            System.out.println("enter a number ");
            number = sc.nextInt();
            if(number %2 ==0){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.println("for continue press 1 and for exit press 0");
            choice = sc.nextInt();
        }
        System.out.println("even sum "+ evenSum);
        System.out.println("odd sum "+ oddSum);

    }
}
