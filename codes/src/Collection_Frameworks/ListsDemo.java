package Collection_Frameworks;
import java.util.*;

//public class ListsDemo {
//    public static void main(String[] args) {
////        🧠 Task 1 – Student Names List
////        Store 5 names in ArrayList
////        Remove one name
////        Print final list
//        ArrayList<String> al=new ArrayList<>();
//        al.add("Nadeem");
//        al.add("Akmal");
//        al.add("venu");
//        al.add("mithun");
//        al.add("Akshay");
//
//        al.remove(2);
//        System.out.println(al);
//
//
//    }
//}

//public class ListsDemo {
//    public static void main(String[] args) {
////        🧠 Task 2 – Undo Feature using Stack
////        Simulate undo:
////        Type: A
////        Type: B
////        Undo → removes B
////        Type: C
////        Undo → removes C
//        Stack<String> s=new Stack<>();
//        s.push("A");
//        s.push("B");
//        System.out.println("Undo -> "+ s.pop());
//        s.push("C");
//        System.out.println("Undo -> "+ s.pop());
//        System.out.println(s);
//    }
//}

public class ListsDemo {
    public static void main(String[] args) {
//      🧠 Task 3 – Insert Fast using LinkedList
//          Add elements at beginning and end
//          Remove middle element
        LinkedList<String> ll=new LinkedList<>();
        ll.addFirst("aws");
        ll.addFirst("dev");
        ll.addFirst("aiml");
        ll.addLast("FSD");
        System.out.println(ll);

        ll.remove(2);
        System.out.println(ll);
    }
}

