/// 1.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
//import java.util.*;
//public class Functions {
//    public static int maxi(int n1,int n2,int n3){
//        int res=Math.max(n1,n2);
//        int ress=Math.max(res,n3);
//        return ress;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int n1=sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int n2=sc.nextInt();
//        System.out.println("Enter 3rd number");
//        int n3=sc.nextInt();
//        System.out.println("Maximum number is : "+ maxi(n1,n2,n3));
//    }
//}

/// 2.Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
///        Marks        Grade
///        91-100         AA
///        81-90          AB
///        71-80          BB
///        61-70          BC
///        51-60          CD
///        41-50          DD
///        <=40          Fail
//import java.util.*;
//public class Functions {
//    public static void grades(int marks){
//        if(marks>91 && marks<=100)
//            System.out.println("Grade : AA");
//        else if(marks>81 && marks<=90)
//            System.out.println("Grade : AB");
//        else if(marks>71 && marks<=80)
//                System.out.println("Grade : BB");
//        else if(marks>61 && marks<=70)
//            System.out.println("Grade : BC");
//        else if(marks>51 && marks<=60)
//                System.out.println("Grade : CD");
//        else if(marks>41 && marks<=50)
//            System.out.println("Grade : DD");
//        else if(marks<40)
//            System.out.println("Failed !");
//        else
//            System.out.println("Enter correct marks !!");
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the marks : ");
//        int marks=sc.nextInt();
//        grades(marks);
//    }
//}


/// 3.Write a program to print the factorial of a number by defining a method named 'Factorial'.
/// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//        4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//        Also,
//        1! = 1
//        0! = 1
//import java.util.*;
//public class Functions{
//    public static void factorial(int n){
//        if(n==1 || n==0){
//            System.out.println("1");
//        }
//        int product=1;
//        System.out.print(n+"! : ");
//        for(int i=1;i<=n;i++){
//            product*=i;
//            System.out.print(i+" ");
//            if(i<n)
//                System.out.print("* ");
//        }
//        System.out.println(" : "+ product);
//    }
//    public static void main(String[] args) {
//        factorial(5);
//    }
//}

/// 4. IS AMSTRONG OR NOT
import java.util.*;
public class Functions{
    public static boolean isAmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            n/=10;
            sum+=digit*digit*digit;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        //PRINTING AMSTRONG FOR 3 DIGITS
        for(int i=100;i<=999;i++){
            if(isAmstrong(i))
                System.out.print(i+" ");
        }
    }
}