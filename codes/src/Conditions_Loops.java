

import java.util.*;
public class Conditions_Loops {
//    static int factorial(int num) {
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

/// 1.Factorial Program In Java
//        System.out.println("Enter no : ");
//        int num=sc.nextInt();
//        System.out.println(factorial(num));
//        int fact=1;
//        for(int i=n;i>=2;i--){
//            fact=fact*i;
//        }
//        System.out.println("Fact("+n+") : "+fact);

///  Subtract the Product and Sum of Digits of an Integer
            int n=sc.nextInt();
            int product=1;
            int sum=0;
            while(n>0){
                int digit=n%10;
                product*=digit;
                sum+=digit;
                n/=10;
            }
            int res=product-sum;
        System.out.println("P-S : "+ res);
    }

}
