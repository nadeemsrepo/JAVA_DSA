package Arrays;

public class TappingRainWater {
    public static void tappingWater(int arr[]){
//        finding leftmost bound
        int lb[]=new int[arr.length];
        lb[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lb[i]=Math.max(arr[i],lb[i-1]);
        }
//        finding rightmost bound
        int rb[]=new int[arr.length];
        rb[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rb[i]=Math.max(arr[i],rb[i+1]);
        }
//        calculation
        int tw=0;
            for(int i=0;i<arr.length;i++){
                int wl=Math.min(lb[i],rb[i]);
                tw +=wl-arr[i];
            }
        System.out.println("Tapped water= "+tw);
    }

    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        tappingWater(arr);
    }
}
