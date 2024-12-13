import java.util.*;
class LinkedList{
    public static void main(String args[]) {
        LinkedList<Integer> a=new LinkedList<>();
        a.add(100);
        a.add(584);
        a.add(88);
        System.out.println(a);
        a.addFirst(89);
        System.out.println(a);
        a.addLast(90);
        System.out.println(a);
    }
}