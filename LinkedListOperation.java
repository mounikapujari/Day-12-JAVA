import java.util.*;
class LinkedListOperation{
    public static void main(String[] args) {
        LinkedList<String> a=new LinkedList<>();
        a.add("Hello");
        a.add("i am");
        a.add("Student");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}