package NQT;

// Factorila without using multiplication
import java.util.*;
public class Q8{
    public static int maxOnes(int matrix[][], int size1, int size2){
        int maxCount=0;
        int index=-1;
        for(int i=0;i<size1;i++){
            int count=0;
            for(int j=0;j<size2;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }
        }
        return index;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();

        int matrix[][]=new int[size1][size2];

        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxOnes(matrix,size1,size2));
    }
}

// 3*3
// 1 0 1
// 0 0 1
// 1 1 1

