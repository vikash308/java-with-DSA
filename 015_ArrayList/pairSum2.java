import java.util.ArrayList;

public class pairSum2 {

    static boolean findPairSum(ArrayList<Integer> list, int target){

        int bp= -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
               bp=i;
                break;
            }
        }

        int left = bp+1;
        int right = bp;
        while(left!=right){
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true;
            }
            if (sum < target) {
                left = (left+1)%list.size();
            }
            if (sum > target) {
                right = (list.size() + right -1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(findPairSum(list, 16));
    }
}
