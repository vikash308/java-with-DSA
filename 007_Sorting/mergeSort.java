public class mergeSort {
    static void mergeSorting(int arr[],int start,int end){
        if(start >= end){
            return;
        }

        int mid = start + (end-start)/2;

        mergeSorting(arr, start, mid);
        mergeSorting(arr, mid+1, end);
        merge(arr, start , mid, end);
    }

    static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start +1];
        int i = start;
        int j= mid +1;
        int k=0;

        while(i <=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++; k++; 
            }else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        while(i<=mid){
            temp[k] = arr[i];
            k++; i++;
        }
        while(j<=end){
            temp[k] = arr[j];
            j++; k++;
        }
        for(k=0, i=start; k<temp.length; k++, i++ ){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,9,3,4,0};
        mergeSorting(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
