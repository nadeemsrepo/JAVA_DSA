package NQT.PYQ;
import java.util.*;
//Question 2: Student Marks Analysis (Medium - 60 Minutes)
    //Problem Statement
    //A school maintains marks of students in multiple subjects in a 2D matrix.
    //Each row represents one student.
    //Each column represents one subject.
    //You are given:
        //An integer N -> number of students
        //An integer M → number of subjects
        //A matrix of size N × M representing marks
    //A student is considered Pass if:
    //They score strictly above the average marks of that subject in at least one subject.
    //Your task is to determine the total number of students who pass
public class Tcs_Tag_Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

//        inputing elements
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        double avg[]=new double[m];

//        calculating average
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i][j];
            }
            avg[j]=(double)sum/m;
        }

        int passed=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>avg[j]){
                    passed++;
                    break;
                }
            }
        }
        System.out.println(passed);
    }
}
