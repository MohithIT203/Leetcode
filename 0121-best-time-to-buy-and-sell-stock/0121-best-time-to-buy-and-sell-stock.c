int maxProfit(int* prices, int pricesSize) {
    int min = prices[0], profit = 0;
    for (int i = 0; i < pricesSize; i++) {
        if (prices[i] < min) {
            min = prices[i];
        }
        if (prices[i] - min > profit) {
            profit = prices[i] - min;
        }
    }
    return profit;
}