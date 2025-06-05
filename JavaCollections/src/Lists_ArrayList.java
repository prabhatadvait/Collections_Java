import java.util.ArrayList;
import java.util.List;

public class Lists_ArrayList {
    public static void main(String[] args) {
        // Create a List

        List<String> list = new ArrayList<>();

        //add element to list
        list.add("Prabhat");
        list.add("Kumar");
        list.add("Sharma");

        //get (int index)
        String secondelement = list.get(1); // Kumar
        System.out.println(secondelement);

        //Set (int index, E element)
        list.set(1,"Blueberry");

        //remove int(index)
        list.remove(2);

        //Size()
        int Size = list.size(); // 2
        System.out.println(Size);

        //Print the list
        System.out.println(list);

    }
}