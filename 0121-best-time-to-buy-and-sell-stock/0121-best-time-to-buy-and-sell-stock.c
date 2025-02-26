int maxProfit(int* prices, int pricesSize) {
    if (pricesSize < 2) return 0;
    int min = prices[0], profit = 0;
    for (int i = 1; i < pricesSize; i++) {
        if (prices[i] < min) {
            min = prices[i];
        }
        if (prices[i] - min > profit) {
            profit = prices[i] - min;
        }
    }
    return profit;
}