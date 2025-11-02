import java.util.Scanner;

public class cs_que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year to check leap year or not ");
        int year = sc.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("entered year is leap year");
            }else{
                System.out.println("entered year is not leap year");
            }
        }else{
            if(year % 4==0){
                System.out.println("entered year is leap year");
            }else{
                System.out.println("entered year is not leap year");
            }
        }
    }
}
