package NQT;
//COUNT PAIRS DIVISIBLE BY 2
import java.util.*;
import java.util.*;
public class Q7
{
     public static void countPairs(int arr[]){
         int evenCount=0;
         int oddCount=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]%2==0){
                 evenCount++;
             }else
                 oddCount++;
         }
         int evenPairs= evenCount*(evenCount-1)/2;
         int oddPairs= oddCount*(oddCount-1)/2;

         System.out.println(evenPairs+ oddPairs);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        // Initializing
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        countPairs(arr);
    }
}
//arr[]={1,2,3,4,5}
//o/p =4;