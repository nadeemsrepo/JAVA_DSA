package Arrays;
//BS works for only sorted array.

public class BinarySearchDemo {
    public static int binarySearch(int arr[],int key){
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=(start + end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else if(arr[mid]>key){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,45,57,68,79,85,92,98,100};
        int result=binarySearch(arr,79);
        if(result==-1){
            System.out.println("Key not found ! ");
        }else
            System.out.println("Key found at index "+result);
        }
    }

