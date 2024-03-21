package ru.netology.services;

public class SalesService {
    public long sumSales(long[] sales) {
        long sum = 0;

        for (long income : sales) {
            sum = sum + income;
        }
        return sum;
    }

    public long averageIncome(long[] sales) {
        long sum = sumSales(sales);
        long average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int monthsBelow = 0;
        long average = averageIncome(sales);

        for (long income : sales) {
            if (income < average) {
                monthsBelow++;
            }
        }
        return monthsBelow;
    }

    public int aboveAverage(long[] sales) {
        int monthsAbove = 0;
        long average = averageIncome(sales);

        for (long income : sales) {
            if (income > average) {
                monthsAbove++;
            }
        }
        return monthsAbove;
    }
}
