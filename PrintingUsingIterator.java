import java.util.*;
public class PrintingUsingIterator {
    public static void main(String[] args) {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Student");
        a.add("Rajesh");
        //printing using Iterator
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}
