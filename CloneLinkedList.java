/*5
88 98 65 78 100
[100, 78, 65, 98, 88]
*/import java.util.*;
class CloneLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> a=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
          int s=sc.nextInt();
          a.addFirst(s);
        }
        LinkedList<Integer> b=new LinkedList<>();
        b=(LinkedList)a.clone();
        System.out.println(b);
    }
}