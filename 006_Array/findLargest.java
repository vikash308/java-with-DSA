
public class findLargest {
    public static int findLargestArray(int num[]){
        int largest=0;
        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = { 5, 12, 7, 12, 9, 3, 21, 5, 18, 0, -4, 15, 7, 30, 1 };

        int largest = findLargestArray(num);
        System.out.println("largest number is " + largest);
    }
}
