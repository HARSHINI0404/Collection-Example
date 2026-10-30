package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        //int a=10, b=-10 , c=0;
        //int d=null;
        //Integer e=new Integer(10);
        //Integer f=new Integer(-10);
        //Integer g=new Integer(null);
        List<Integer> list1=new LinkedList<>(); //{10,-10,null,0,20,-50}
        List<?> list2=new LinkedList<>(); //{10,"Hi",false,4.56,69.78f,-10,'y'}
        List<Object> list3=new LinkedList<>(); //{10,"Hi",false,4.56,69.78f,-10,'y'}
        list1.add(10);
        list1.add(67);
        list1.add(-46);
        list1.add(0);
        list1.add(null);
        list1.add(100);
        System.out.println(list1);
        list1.remove(5);
        System.out.println("After removing the 5th value from list1: "+list1);
        System.out.println("Size of the list1: "+list1.size());
        System.out.println("get the 4th value from list1: "+list1.get(4));
        System.out.println("get the 2th value from list1: "+list1.get(2));
        list1.remove(4);
        System.out.println("After removing the 4th value from list1: "+list1);
        Collections.sort(list1);
        System.out.println("After sorting the list1: "+list1);
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("After reversinging the list1: "+list1);
        System.out.println("Foreach loop traversal");
        for(Integer i:list1){
            System.out.println(i);
        }
    }
}
