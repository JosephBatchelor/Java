import java.util.*;
public class Queue {
    public static void main(String args[]){
            //create queue
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.offer("first");
        q.offer("second");
        q.offer("thrid");
        System.out.printf("%s", q);
        System.out.println();

    //peak method picks the first element
        System.out.printf("%s", q.peek());
        System.out.println();
    //poll method will remove the element with the higest priority
        q.poll();
        System.out.printf("%s ", q);


    }
}
