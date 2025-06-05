import java.util.HashSet;
import java.util.Set;

public class Hashset_example {
    public static void main(String[] args){

        //create a set
        Set<String> set =  new HashSet<>();

        //Add elements to the set
        set.add("Prabhat");
        set.add("Kumar");
        set.add("Sharma");

        // print element of the set
//        System.out.println(set);

        for(String s:set){
            System.out.print(s);
        }
        System.out.println();

        //Remove an element from the set
        set.remove("Kumar");

        //Check if the set contains an element
        boolean containsApple = set.contains("Sharma");
        System.out.println("Contains Apple: "+ containsApple);

        //Get the size of set
        int size = set.size();
        System.out.println("Size of the set is: "+size);

//      2. Clearing the set:
        set.clear();
//      3. Check if empty:

        if (set.isEmpty()) {
            System.out.println("Set is empty");
        }
    }
}
