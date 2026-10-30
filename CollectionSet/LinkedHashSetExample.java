package CollectionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(45);
        set1.add(-19);
        set1.add(45);
        set1.add(-96);
        set1.add(null);
        set1.add(0);
        set1.add(100);
        System.out.println("The set contains: "+set1);
        set1.remove(100);
        System.out.println("After removing the data, The set contains: "+set1);
        System.out.println("The set contains (ForEach traversal): ");
        for(Integer i : set1){
            System.out.println(i);
        }
    }
}
