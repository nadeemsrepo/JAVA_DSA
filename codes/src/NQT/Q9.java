package NQT;

import java.util.*;
public class Q9{
    public static void febonacciSeries(int n){
        if(n<0) return;
        int firstelement=0;
        int secondElement=1;
        System.out.print(firstelement+" ");
        System.out.print(secondElement+" ");
        for(int i=1;i<n;i++){
            int add=firstelement+secondElement;
            System.out.print(add+" ");
            firstelement=secondElement;
            secondElement=add;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        febonacciSeries(n);
    }
}
