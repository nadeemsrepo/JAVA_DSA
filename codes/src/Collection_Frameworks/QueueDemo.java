package Collection_Frameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        🥇 Question: API Request Processing System (Queue – FIFO)
//        Problem Statement:
//        You are building a backend system that processes incoming API requests.
//                Requests arrive in this order:
//["login", "fetchProfile", "updateProfile", "logout"]
//        You must:
//        Add all requests to a Queue
//        Process requests one by one (FIFO order)
//        Print the request being processed
//        After processing all, print: "All requests processed"
//
//✅ Expected Output
//        Processing: login
//        Processing: fetchProfile
//        Processing: updateProfile
//        Processing: logout
//        All requests processed

        String requests[]={"login", "fetchProfile", "updateProfile", "logout"};
        Queue<String> q=new LinkedList<>();

//        Adding requests to queue
        for(String str:requests){
            q.offer(str);
        }

//        Processing
        while(!q.isEmpty()){
            String curr= q.poll();
            System.out.println("Processing : "+ curr);
        }
        System.out.println("All request processed");

    }
}
