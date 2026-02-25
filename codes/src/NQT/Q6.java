package NQT;

// A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

// Given an integer n, return true if n is a perfect number, otherwise return false.

// Example 1:

// Input: num = 28
// Output: true
// Explanation: 28 = 1 + 2 + 4 + 7 + 14
// 1, 2, 4, 7, and 14 are all divisors of 28.
// Example 2:

// Input: num = 7
// Output: false
import java.util.*;
public class Q6{
    public static boolean perfectnumber(int n){
        if(n<0){
            return false;
        }
        int sum=1;
        for(int i=2;i*(long)i<=n;i++){
            if(n%i==0){
                sum+=i;

                if(i!=n/i){
                    sum=sum+n/i;
                }
            }
        }
        return n==sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(perfectnumber(n));
    }
}