/*3
ram raj ravi
[ravi, raj, ram]
*/import java.util.*;
public class AcceptingvaluesinHashSet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashSet<String> a=new HashSet<>();
        //accepting the values into hashset
        int n=s.nextInt();
        for (int i=0;i<n; i++) {
           String s1=s.next();
           a.add(s1);
        }
        System.out.println(a);    
        }
    }
