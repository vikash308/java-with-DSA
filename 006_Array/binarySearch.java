public class binarySearch {
    public static void main(String[] args) {
        int num[] = { 5, 12, 7, 12, 9, 3, 21, 5, 18, 0, -4, 15, 7, 30, 1 };
        int target = 18;

        for (int i = 1; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1; j++) {

                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +" ");
        }

        int start = 0, end = num.length -1;
        while(start <= end){
            int mid = (start + end) /2;

            if(num[mid] == target){
                System.out.println("target found at index" + mid);
                break;
            }

            if(num[mid] < target){
                start = mid +1;
            }
            if(num[mid] >target){
                end= mid -1;
            }
        }
    }
}
