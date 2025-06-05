import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){

        //create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        //add method and throws exception when insertion fails
        queue.add("Element1");
        queue.add("Element2");
        queue.add("Element3");

        System.out.println(queue);

        //use offer to insert return fails if insertion fails
        queue.offer("Element4");

        //Peek at the first element (does not remove it)
        String firstele = queue.peek();
        System.out.println("Peek: "+ firstele);

        //Poll , retrives and remove it
        String pollele = queue.poll();
        System.out.println(pollele);
    }
}
