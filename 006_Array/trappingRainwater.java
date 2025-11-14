public class trappingRainwater {

    public static void trappingRainWater(int nums[]) {
        int prev[] = new int[nums.length];
        int next[] = new int[nums.length];

        prev[0] = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            prev[i] = Math.max(prev[i - 1], nums[i]);
        }

        next[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length-2; i >= 0; i--) {
            next[i] = Math.max(next[i + 1], nums[i]);
        }
        int count =0;
        for(int i =0; i<nums.length; i++){
            count += Math.min(prev[i], next[i]) - nums[i];
        }

        System.out.println("Output is : " + count);
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        trappingRainWater(nums);
    }
}
