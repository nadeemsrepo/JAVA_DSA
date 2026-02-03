package Arrays;

public class RemoveDuplicateElementAndReturnNoOfElement {
    static int remDupElem(int arr[]){
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(remDupElem(arr));
    }
}
