import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);

        //Sorting
        Collections.sort(numbers);
        System.out.println("Sorted List: "+ numbers);

        //Reverse Order
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        //Min/Max Operations
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: "+min + ", Max: " + max);

        //Synchronization
        List<Integer> synchronisedList = Collections.synchronizedList(numbers);
        System.out.println("SynchronisedList: "+synchronisedList);
        /*
         1. What is synchronizedList()?
            List<Integer> syncList = Collections.synchronizedList(originalList);
            ✅ Purpose:
            Makes a thread-safe wrapper around your list.
            This means:
            Multiple threads can access the list safely without data corruption.
            Every method call on the list is synchronized using an internal lock.
         */

        //Unmodifiable Collections
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        /*
        . What is unmodifiableList()?
            List<Integer> readOnlyList = Collections.unmodifiableList(originalList);
            ✅ Purpose:
            Creates a read-only version of your list.

            If someone tries to do:
            readOnlyList.add(99);  // 🚫 Throws UnsupportedOperationException
            Use cases:
            When you want to protect data from being modified.
         */
    }
}
