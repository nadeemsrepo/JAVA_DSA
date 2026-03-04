package NQT.PYQ;


//Problem Statement
//        Ayush is working on an algorithm where he needs to convert a string A into another string B. Both strings consist of lowercase English letters and have the same length N.
//        He can perform the following operation any number of times:
//
//        Choose any subset of indices from the string A.
//        Find the smallest character among the selected characters.
//        Replace all characters in the chosen subset with that smallest character.
//        Determine the minimum number of operations required to convert string A into string B.
//
//        If the conversion is not possible, return -1.
//
//        Input Format
//        The input will be provided in the following format:
//        N
//        A
//        B
//        Where:
//        N → integer representing the length of the strings
//        A → initial string
//        B → target string
//
//        Output Format
//        Print a single integer representing the minimum number of operations required.
//        If conversion is impossible, print -1.
//
//        Constraints
//        1 ≤ N ≤ 1000
//        A and B consist of lowercase English letters
//        Length of A = Length of B = N
//
//        Example 1         Example 2           Example 3
//        Input             Input               Input
//        5                 4                   2
//        abcab             abab                de
//        aabab             abaa                cd
//        Output            Output              Output
//        2                 1                   -1
//

import java.util.*;

public class Paper_1_Advanced_coding {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String A=sc.next();
        String B=sc.next();

        char[] a=A.toCharArray();
        char[] b=B.toCharArray();

//        checking conversation
        for(int i=0;i<n;i++){
            if(a[i]<b[i]){
                System.out.println("-1");
                return;
            }
        }
        int operation=0;
        for(char c='z';c>='a';c--){
            char smallest='{';
            for(int i=0;i<n;i++){
                if(a[i]==c && b[i]<c){
                    smallest=(char)Math.min(smallest,b[i]);
                }
            }

            if(smallest!='{'){
                operation++;
                for(int i=0;i<n;i++){
                    if(a[i]==c && b[i]<=smallest);
                    a[i]=smallest;
                }
            }
        }
        System.out.println(operation);
    }
}
