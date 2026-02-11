package Collection_Frameworks;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
//public class MapsDemo {
//    public static void main(String[] args) {
////        🥇 Q1. Frequency Counter (HashMap – Core DSA)
////        Problem:
////        Given an integer array, print elements that appear more than once with their frequency.
////                Input:
////                [1, 2, 3, 1, 2, 1, 4]
////        Output:
////        1 -> 3
////        2 -> 2
//
//        int arr[]={1,2,3,1,2,1,4,3,4,1};
//        Map<Integer,Integer> m=new HashMap<>();
//
////        Counting frequency
//        for(int n : arr){
//            m.put(n,m.getOrDefault(n,0)+1);
//        }
////        Printing
//        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
//            if(entry.getValue()>1){
//                System.out.println(entry.getKey()+ "-->"+entry.getValue());
//            }
//        }
//    }
//}


//public class MapsDemo {
//    public static void main(String[] args) {
////       //🥈 Q2. Maintain Insertion Order (LinkedHashMap – Real-life Cache)
//////Problem:
//////Design a small cache that stores at most 3 recent search queries.
//////When a new query comes:
//////If size > 3 → remove the oldest inserted query
//////Print current cache in order
//////
//////Input:
//////google, youtube, github, chatgpt
//////Output:
//////youtube, github, chatgpt
//        String str[] = {"google", "youtube", "github", "chatgpt"};
//        Map<String, String> m = new LinkedHashMap<>();
//
//        for (String s : str) {
//            m.put(s, s);
//            if (m.size() > 3) {
//                String oldKey = m.keySet().iterator().next();
//                m.remove(oldKey);
//            }
//            System.out.println(m.keySet());
//        }
//        System.out.println("Final : " + m.keySet());
//    }
//}


//public class MapsDemo {
//    public static void main(String[] args) {
//        //Problem:
////Given students with marks, print them in sorted order of marks.
////Input:
////        ("Nadeem", 85), ("Rahul", 70), ("Aisha", 92)
////Output (Sorted by marks):
////        70 -> Rahul
////        85 -> Nadeem
////        92 -> Aisha
//
//        TreeMap<Integer, String> t=new TreeMap<>(Collections.reverseOrder());
//        t.put(85,"Nadeem");
//        t.put(92, "Aisha");
//        t.put(70, "Rahul");
//        int count=0;
//        for(Map.Entry<Integer, String> entry: t.entrySet()){
//            System.out.println(entry.getKey()+ "->"+ entry.getValue());
//            count++;
//            if(count==2)
//                break;
//        }
//    }
//}



public class MapsDemo {
    public static void main(String[] args) throws  InterruptedException{
        //🏅 Q4. Thread-Safe Counter (ConcurrentHashMap – System Design Lite)
//
//Problem:
//Simulate multiple users visiting pages.
//Store page visit counts in a thread-safe way.
//
//Concept:
//Multiple threads incrementing visit count of:
//        /home, /login, /profile
        String arr[]={"/home","/login","/profile"};

        ConcurrentHashMap<String, Integer> chm=new ConcurrentHashMap<>();

        Runnable task=()->{
            for(int i=0;i<1000;i++){
                String p=arr[i% arr.length];
//                chm.put(p,chm.getOrDefault(p,1)+1);
                chm.merge(p,1,Integer::sum);
            }
        };
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        Thread t3=new Thread(task);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Final" + chm);
    }
}