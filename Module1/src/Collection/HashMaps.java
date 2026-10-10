package Collection;
import java.util.*;
public class HashMaps {
    public static void main() {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("ABC",4);
        marks.put("MNO",1);
        marks.put("GHI",2);
        marks.put("JKL",5);
        marks.put("DEF",3);
        System.out.println(marks);
        System.out.println(marks.get(4));
        System.out.println(marks.containsKey(2));
        System.out.println(marks.containsValue("ABC"));
        System.out.println(marks.values());
        System.out.println(marks.remove(4));
        System.out.println(marks.remove(4));
    }
}
