import java.util.*;

class que1{
    public static void main(String args[]){
        Scanner sc =new  Scanner(System.in);
        System.out.println("enter three numbers for finding average");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        double avg = (a+b+c)/3;
        System.out.println("average is :" + avg);
    }
}