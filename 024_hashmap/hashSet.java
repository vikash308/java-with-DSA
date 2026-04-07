import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
        System.out.println(set.size());

        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        for(int j : set){
            System.out.println(j);
        }
    }
}
