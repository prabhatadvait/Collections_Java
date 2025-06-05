import  java.util.PriorityQueue;

// Min Heap:-
//The smallest element is always at the front (top of the heap).

// Max Heap:-
//PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

public class PriorityQueue_heap {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min heap

        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(3);

        System.out.println(minHeap.poll()); //1
        System.out.println(minHeap.peek()); //3
    }
}
