import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        Set<Integer> keySet = map.keySet();
        System.out.println("Set of Keys: " + keySet);


        Collection<String> values = map.values();
        System.out.println("Collection of Values: " + values);


        Set<HashMap.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("Set of Key-Value Pairs: " + entrySet);
    }
}
