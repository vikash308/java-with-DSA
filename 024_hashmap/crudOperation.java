import java.util.*;

public class crudOperation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);

        System.out.println(map);

        System.out.println(map.get("US"));
        System.out.println(map.remove("US"));
        System.out.println(map);
        System.out.println(map.containsKey("India"));

        map.put("Nepal", 5);
        map.put("Indonesia", 6);
        System.out.println("size = "+map.size());

        Set<String> keys = map.keySet();

        for (String k : keys) {
            System.out.println("key=" +k+ " , value=" +map.get(k));
        }

        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();

        map1.put("India", 100);
        map1.put("China", 150);
        map1.put("US", 50);

        System.out.println(map1);

        System.out.println(map1.get("US"));
        System.out.println(map1.remove("US"));
        System.out.println(map1);
        System.out.println(map1.containsKey("India"));

        map1.put("Nepal", 5);
        map1.put("Indonesia", 6);
        System.out.println("size = "+map1.size());


        TreeMap<String, Integer> map2 = new TreeMap<>();

        map2.put("India", 100);
        map2.put("China", 150);
        map2.put("US", 50);

        System.out.println(map2);

        System.out.println(map2.get("US"));
        System.out.println(map2.remove("US"));
        System.out.println(map2);
        System.out.println(map2.containsKey("India"));

        map2.put("Nepal", 5);
        map2.put("Indonesia", 6);
        System.out.println("size = " + map2.size());
    }    
}
