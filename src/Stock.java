public class Stock {
//    public int maxProfit(int[] prices) {
//
//        int maxProfit = 0;
//
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[j] - prices[i] > maxProfit) {
//                    maxProfit =prices[j] - prices[i];
//                }
//            }
//        }
//
//        return maxProfit;
//
//
//
//
//    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            if (prices[i] > max) {
                max = prices[i];
            }


        }

        return max - min;
    }
}
