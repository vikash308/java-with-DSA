
public class insertionSort {
    public static void insertionSorting(int nums[]){
        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev>=0 && nums[prev]> curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = { 5, 12, 7, 12, 9, 3, 21, 5, 18, 0, -4, 15, 7, 30, 1 };
        insertionSorting(nums);
    }
}
