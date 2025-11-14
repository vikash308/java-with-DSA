public class bestTimetoBuySellStock {
    public static int findBestTime(int nums[]) {
       int buyPrice = Integer.MAX_VALUE;
       int maxProfit = 0;
       for(int i=0; i<nums.length; i++){
            if(buyPrice<nums[i]){
                int profit =  nums[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = nums[i];
            }
       }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4};

       int profit =  findBestTime(nums);
       System.out.println("profit is " + profit);
    }
}
