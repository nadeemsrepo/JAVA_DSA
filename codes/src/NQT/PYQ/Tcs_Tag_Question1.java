package NQT.PYQ;
//You are given two integers L and R, representing a range of numbers (inclusive).
//A number is called a Cryptic Number if it satisfies all of the following conditions:
//        1. It is divisible by 7.
//        2. It is not divisible by 5.
//        3. It is not a palindrome.
//        4. It does not contain any repeated digits.
//Your task is to print all cryptic numbers in the given range.
//If no such number exists, print -1.
import java.util.*;
public class Tcs_Tag_Question1 {
//    Function for palindrome
    public static boolean isPalindrome(int n){
        int original=0;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev==original;
    }

//    Function for is the digit is repeted or not
    public static boolean repeatedDigit(int n){
        boolean seen[]=new boolean[10];
        while(n>0){
            int digit=n%10;
            if(seen[digit]){
                return true;
            }
            seen[digit]=true;
            n=n/10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        boolean found=false;
        for(int i=l;i<r;i++){
            if(i%7==0 && i%5!=0){
                if(!isPalindrome(i) && !repeatedDigit(i)){
                    System.out.println(i+" ");
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }
}
