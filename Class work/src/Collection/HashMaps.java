package Collection;
import java.util.*;
public class HashMaps {
    public static void main() {
        Map<Integer, String> marks = new HashMap<>();
        marks.put(1,"ABC");
        marks.put(2,"DEF");
        marks.put(3,"GHI");
        marks.put(4,"JKL");
        marks.put(5,"MNO");
        System.out.println(marks);
        System.out.println(marks.get(4));
        System.out.println(marks.containsKey(2));
        System.out.println(marks.containsValue("ABC"));
        System.out.println(marks.values());
        System.out.println(marks.remove(4));
        System.out.println(marks.remove(4));
    }
}
