
public class selectionSort {
    public static void selectionSorting(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos]>nums[j]){
                    minPos= j;
                }
                int temp =  nums[minPos];
                nums[minPos] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]= { 5, 12, 7, 12, 9, 3, 21, 5, 18, 0, -4, 15, 7, 30, 1 };
        selectionSorting(nums);
    }
}
