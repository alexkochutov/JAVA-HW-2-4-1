package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long totalSum = 0;

        for (long sale : sales) {
            totalSum = totalSum + sale;
        }

        return totalSum;
    }

    public long calculateAverage(long[] sales) {
        long totalAverage = 0;

        totalAverage = calculateSum(sales) / sales.length;

        return totalAverage;
    }

    public int calculateMinSales(long[] sales) {
        int month = 0;
        int minMonth = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }

        return minMonth + 1;
    }

    public int calculateMaxSales(long[] sales) {
        int month = 0;
        int maxMonth = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }

        return maxMonth + 1;
    }

    public int calculateLessAverage(long[] sales) {
        int monthCount = 0;

        for (long sale : sales) {
            if (sale <= calculateAverage(sales)) {
                monthCount = monthCount + 1;
            }
        }

        return monthCount;
    }

    public int calculateMoreAverage(long[] sales) {
        int monthCount = 0;

        for (long sale : sales) {
            if (sale > calculateAverage(sales)) {
                monthCount = monthCount + 1;
            }
        }

        return monthCount;
    }
}
