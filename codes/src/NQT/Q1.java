package NQT;
//COUNT ODD DIGITS IN A GIVEN NUMBER
public class Q1 {
    public static int countOddDigits(int n){
        int count=0;
        if(n==0){
            return 0;
        }
        while(n>0){
            int digit=n%10;
            if(digit%2!=0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOddDigits(2578));
    }
}
