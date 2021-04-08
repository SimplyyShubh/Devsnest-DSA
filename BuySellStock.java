public class BuySellStock {
    
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE , maxP = 0;

        for (int i = 0; i < prices.length; ++i) {
            if(prices[i]< min)
                min = prices[i] ;
            
            else if(prices[i] - min > maxP)
                maxP = prices[i] - min ;
        }

        return maxP ;
    
    }
    public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{1,2})) ;    
    }
}
