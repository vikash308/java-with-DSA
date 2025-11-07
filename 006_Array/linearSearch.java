
public class linearSearch {
    public static int linearSearchFun(int num[], int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {5, 12, 7, 12, 9, 3, 21, 5, 18, 0, -4, 15, 7, 30, 1};
;
        int target = 6;

        int index = linearSearchFun(num, target);

        if(index == -1){
            System.out.println("item not found");
        }else{
            System.out.println("item found on index " + index);
        }
    }
}
