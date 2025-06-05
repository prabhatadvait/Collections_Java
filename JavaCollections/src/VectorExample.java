import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        //create a vector
        Vector<String> vector = new Vector<>();

        //Add element
        vector.add("prabhat");
        vector.add("Sharma");
        vector.add("kumar");

        //Access element
        System.out.println("Second element: "+vector.get(1));

        //Modify element
        vector.set(1,"Blueberry");

        //remove element
        vector.remove(2);

        System.out.println(vector.size());
        System.out.println(vector);
    }
}
