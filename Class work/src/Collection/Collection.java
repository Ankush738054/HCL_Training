package Collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0;i<5;i++){
            numbers.add(i);
        }

//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//        numbers.add(50);
//        numbers.add(60);
//        numbers.add(70);
//        numbers.add(80);
//        numbers.add(90);
//        numbers.add(100);

        numbers.set(2, 35);
        numbers.set(3, 85);

        System.out.println("Updated elements: " + numbers.get(2) + ", " + numbers.get(3));
        System.out.println("All elements"+ numbers);
    }
}
