package ru.netology.stats.StatsService.services;

public class StatsService {

    public long salesSum(long[] sales) {
        long sum = 0;
        for (int k = 0; k < sales.length; k++) sum += sales[k];
        return sum;
    }

    public long averageSalesSum(long[] sales) {
        long sumOfSales = salesSum(sales);
        return (sumOfSales / sales.length);
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) maxMonth = i;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) minMonth = i;
        }
        return minMonth + 1;
    }

    public int monthsWhereSalesBeforeAverage(long[] sales){
        int monthsAmountBeforeAverage = 0;
        double averageSum = averageSalesSum(sales);
        for (int k = 0; k < sales.length; k++) {
            if (sales[k] < averageSum) monthsAmountBeforeAverage++;
        }
        return monthsAmountBeforeAverage;
    }

    public int monthsWhereSalesAboveAverage(long[] sales){
        int monthsAmountAboveAverage = 0;
        double averageSum = averageSalesSum(sales);
        for (int k = 0; k < sales.length; k++) {
            if (sales[k] > averageSum) monthsAmountAboveAverage++;
        }
        return monthsAmountAboveAverage;
    }

}
