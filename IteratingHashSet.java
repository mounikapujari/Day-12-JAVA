import java.util.*;
class IteratingHashSet{
    public static void main(String[] args) {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Rajesh");
        //Iterator
        for(String s:a){
          System.out.println(s+" ");
        }
    }
}