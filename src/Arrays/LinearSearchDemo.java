package Arrays;

public class LinearSearchDemo {

    public static void linearScearch(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Key not found ! ");
        }
    }
        public static void main (String[]args){
            int arr[] = {1, 4, 7, 8, 3, 4, 6};
            linearScearch(arr, 5);
        }
    }

