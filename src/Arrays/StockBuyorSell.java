package Arrays;

public class StockBuyorSell {
    public static void stocks(int price[]){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<price.length;i++){
            if(buyingPrice<price[i]){
              int profit=price[i]-buyingPrice;
              maxProfit=Math.max(maxProfit,profit);
            }else
                buyingPrice=price[i];
        }
        System.out.println("Maximum profit : "+maxProfit);
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        stocks(price);
    }
}
