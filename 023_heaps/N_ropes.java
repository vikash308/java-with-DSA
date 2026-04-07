import java.util.PriorityQueue;

public class N_ropes {
    public static void main(String[] args) {
        int nums[] = {2,3,3,5,8};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }

        int cost =0;
        while(pq.size() >1){
            int num = pq.remove();
            int num2 = pq.remove();

            cost = (num+num2);
            pq.add(cost);
        }

        System.out.println(pq.peek());
    }
}
