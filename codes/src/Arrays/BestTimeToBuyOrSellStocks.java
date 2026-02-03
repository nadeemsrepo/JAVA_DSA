package Arrays;

public class BestTimeToBuyOrSellStocks {
    static int stocks(int prices[]){
        int minimumPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int p: prices){
            if(p<minimumPrice)
                minimumPrice=p;
            if(p-minimumPrice> maxProfit)
                maxProfit=p-minimumPrice;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
//        int prices[]={7,1,5,3,6,4};
        int prices[]={7,6,4,3,1};
        System.out.println(stocks(prices));
    }
}
