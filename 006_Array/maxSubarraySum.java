public class maxSubarraySum {

    public static void maxSubArraySum(int nums[]){
        int maxSum = Integer.MIN_VALUE, currSum = nums[0];
        for(int i = 1; i<nums.length; i++){
            currSum =  currSum + nums[i];

            if(currSum<0){
                currSum=  0;
            }

            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("maximum sum : " + maxSum);
    }
    public static void main(String[] args) {
        int nums[] = { 5, 4, -1, 7, 8};

        maxSubArraySum(nums);
    }
}
