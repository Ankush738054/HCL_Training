package Collection;
import java.util.*;
import java.util.Collection;

public class queue {
    public static void main() {
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        q.offer(4);
//        q.offer(5);
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
//        q.offer(6);
//        System.out.println(q.poll());
//        System.out.println(q);


        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        q.offer(6);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
