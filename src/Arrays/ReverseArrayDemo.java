package Arrays;

public class ReverseArrayDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int first=0;
        int last=arr.length-1;
        while(first<last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        for(int m : arr){
            System.out.print(m+ " ");
        }
    }
}
