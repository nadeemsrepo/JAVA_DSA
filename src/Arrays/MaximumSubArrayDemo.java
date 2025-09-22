package Arrays;

public class MaximumSubArrayDemo {
////    BRUTEFORCE APPROACH
//    public static void maximumSumSubarray(int arr[]){
//
//        int maximumSum=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                int currentSum=0;
//                for(int k=i;k<=j;k++){
//                    currentSum+=arr[k];
//                    maximumSum=Math.max(currentSum,maximumSum);              }
//            }
//        }
//        System.out.println("Maximum sum : "+maximumSum);
//    }

/// KADANS ALGORITHM
public static void maximumSumSubarray(int arr[]){
    int currentSum=0;
    int maximumSum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        currentSum+=arr[i];
        if(currentSum<0){
            currentSum=0;
        }
    }
    maximumSum=Math.max(currentSum,maximumSum);
    System.out.println("Maximum sum : "+ maximumSum);
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        maximumSumSubarray(arr);
    }
}
