// multiple functions with the same name but diifferent parameter


public class methodOverloading {
    public static void main(String[] args) {
        Calulator calc= new Calulator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.9f, 2.6f));
        System.out.println(calc.sum(1, 2,3));
    }
}

class Calulator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
}
