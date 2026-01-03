
public class inversionCount {
    static int count =0;
    static  int inversion(int arr[]){
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr,low , high);
        return count;
    }

    static void mergeSort(int arr[], int low, int high){
        if(low<high){
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid +1, high);
            mergeArray(arr,low , mid ,high);
        }
    }

    static void mergeArray(int arr[], int low , int mid , int high){
        int temp[] = new int[high - low + 1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i <= mid && j <= high) {
            if (arr[i] > arr[j]) {
                count += (mid - i + 1);
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (i = low, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        inversion(arr);
        System.out.println(count);
    }
}
