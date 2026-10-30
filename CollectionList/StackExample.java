package CollectionList;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("apple");
        stack.push("orange");
        stack.push("pear");
        stack.push("grape");
        stack.push("kiwi");
        stack.push("apple");
        stack.push(null);
        System.out.println("stack contains: "+stack);
        stack.pop();
        System.out.println("stack contains after 1st pop: "+stack);
        stack.pop();
        System.out.println("stack contains after 2nd pop: "+stack);
        System.out.println("stack- Foreach traversal");
        for(String s: stack){
            System.out.println(s);
        }
    }
}
