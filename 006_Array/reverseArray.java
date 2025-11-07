public class reverseArray {
    public static void main(String[] args) {
        int num[] = {-4, 0, 1, 3, 5, 5, 7, 7, 9, 12, 12, 15, 18, 21, 30};

        for(int i=0, j=num.length-1; i<j; i++, j--){

            int temp = num[i];
            num[i]=num[j];
            num[j]= temp;
        }
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
    }
}
