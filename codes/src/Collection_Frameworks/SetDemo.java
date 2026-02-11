package Collection_Frameworks;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

//public class SetDemo {
//    public static void removeDuplicate(int id[]){
//        Set<Integer> unique=new HashSet<>();
//        for(int n: id){
//            unique.add(n);
//        }
//        System.out.println(unique);
//    }
//    public static void main(String[] args) {
////        🥇 Q1. Remove Duplicates from Stream (HashSet – Core DSA)
////        Problem:
////        You receive user IDs from an API:
////          [101, 102, 101, 103, 102, 104]
////        Print unique user IDs.
//            int id[]={101,102,103,102,104};
//            removeDuplicate(id);
//    }
//}


//public class SetDemo {
//    public static void ser(String searched[]){
//        Set<String> unique =new LinkedHashSet<>();
//        for(String str : searched){
//            unique.add(str);
//        }
//        System.out.println(unique);
//
//    }
//    public static void main(String args[]){
//        //🥈 Q2. Recent Unique Searches (LinkedHashSet – Order Matters)
////Problem:
////Input:
////google, youtube, google, chatgpt, youtube
////Output (keep first occurrence order):
////google, youtube, chatgpt
//        String searched[]={"google", "youtube", "google", "chatgpt", "youtube"};
//        ser(searched);
//    }
//}



//public class SetDemo {
//    public static void UniqueId(int ids[]){
//        Set<Integer> uid=new TreeSet<>();
//        for(int n:ids){
//            uid.add(n);
//        }
//        System.out.println(uid);
//    }
//    public static void main(String args[]){
//        //🥉 Q3. Sorted Leaderboard IDs (TreeSet – Sorted Data)
////Problem:
////Given scores user IDs:
////        [45, 12, 89, 12, 1]
////Print unique user IDs in sorted order.
//        int ids[]={45,12,89,12,1};
//        UniqueId(ids);
//    }
//}


public class SetDemo {
    public static void UserTracker() throws InterruptedException {
        Set<Integer> users=new ConcurrentSkipListSet<>();
        Thread t1=new Thread(()->{
            users.add(1);
            users.add(23);
            users.add(15);
        });
        Thread t2=new Thread(()->{
            users.add(1);
            users.add(78);
            users.add(23);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(users);
    }

    public static void main(String args[]) throws  InterruptedException{
            //🏅 Q4. Online Users Tracker (ConcurrentSkipListSet – Concurrency)
//Problem:
//Multiple threads add/remove user IDs to track online users.
//Print sorted active user IDs safely.
        UserTracker();
    }
}
