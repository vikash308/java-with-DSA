public class numbertoWords {
    static void convert(String arr[], int num){
        if(num == 0){
            return ;
        }

        int digit = num%10;
        convert(arr, num/10);
        System.out.print(arr[digit]+ " ");
    }
    public static void main(String[] args) {
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        convert(arr, 1995);
    }
}
