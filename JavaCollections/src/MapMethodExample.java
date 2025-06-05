import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodExample {
    public static void main(String[] args){
        //Create a new HashMap

        Map<String,Integer> map = new HashMap<>();

        //put(key,value) -Inserts key-value pairs into the map
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);

        //get(Object key) - Returns the value associated with the key
        Integer value = map.get("Apple");
        System.out.println(value);

        //remove(Object key) - Removes the key-value pair for the specified key
        map.remove("Orange");

        //print the map
        System.out.println(map);

        //Contains(Object key) - Checks if the map contains the specified key
        boolean hasApple = map.containsKey("Apple");
        System.out.println(hasApple);

        //keySet() - Returns a set view  of the keys contained in the map
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //2. entrySet() – iterate over both key and value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //3. values() – get all values
        for (Integer v : map.values()) {
            System.out.println(v);
        }
    }
}
