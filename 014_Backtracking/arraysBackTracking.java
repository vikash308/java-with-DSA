public class arraysBackTracking {
    static void backtracking(int arr[], int index, int value){
        if(index == arr.length){
            printArr(arr);
            return ;
        }

        arr[index] = value;
        backtracking(arr, index+1, value+1);
        arr[index] = arr[index] -2;
    }
    static void printArr(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        backtracking(arr, 0, 1);
        printArr(arr);
    }
}
