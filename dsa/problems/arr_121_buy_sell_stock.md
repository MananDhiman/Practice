# 121. [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

## Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


## [Leetcode Solution Source](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/1735493/java-c-best-ever-explanation-could-possible/)
## Algorithm Working 
* Algorithm works in O(n) and transverse the input array prices only once
* On each day, check if price is the lowest price yet. If true, record lowest price
* Find profit that can be had on the given day
* If max profit less than today's profit, set max profit to today's profit
* Iterate entire array, and finally return max profit

## Code
```java
public int maxProfit(int[] prices) {
  int minBuyPrice = Integer.MAX_VALUE;
  int maxProfit = 0; 
  int todayProfit = 0;
  
  for(int i = 0; i < prices.length; i++){
      if(prices[i] < minBuyPrice) minBuyPrice = prices[i]; 

      todayProfit = prices[i] - minBuyPrice;

      if(maxProfit < todayProfit) maxProfit = todayProfit;
  }

  return maxProfit;      
}
```

