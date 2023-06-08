package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int mounthMaximumSale(long[] sales) {
        int mounthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[mounthMaximum]) {
                mounthMaximum = i;
            }
        }
        return mounthMaximum + 1;
    }

    public int mounthMinimumSale(long[] sales) {
        int mounthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mounthMinimum]) {
                mounthMinimum = i;
            }
        }
        return mounthMinimum + 1;
    }

    public int salesBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int salesHigherAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}




