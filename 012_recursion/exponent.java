
public class exponent {
    static int power(int num, int exp){
        if(exp == 0){
            return 1;
        }
        int val = num * power(num, exp-1);
        return val;
    }

    static int optimizePower(int num, int exp){
        if(exp == 0){
            return 1;
        }
        int halfPower = optimizePower(num, exp-1);
        int halfPowerSQ = halfPower * halfPower;

        if(exp != 0){
            halfPowerSQ = num * halfPower;
        }

        return halfPowerSQ;
    }
    public static void main(String[] args) {
        System.out.println(optimizePower(2, 10));
    }
}
