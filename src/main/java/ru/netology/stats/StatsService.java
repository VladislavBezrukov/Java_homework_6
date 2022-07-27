package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long getSalesAmount(long[] sales) {
        long salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            salesAmount += sales[i];
        }
        return salesAmount;
    }

    public long getAverageAmount(long[] sales) {
        long sum = getSalesAmount(sales);
        int count = sales.length;
        long averageAmount = sum / count;

        return averageAmount;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getCountMonthUnderAverage(long[] sales) {
        int countMonth = 0;
        long averageAmount = getAverageAmount(sales);
        for (long sale : sales) {
            if (sale < averageAmount) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int getCountMountAfterAverage(long[] sales) {
        int countMoth = 0;
        long averageAmount = getAverageAmount(sales);
        for (long sale : sales) {
            if (sale > averageAmount) {
                countMoth++;
            }
        }
        return countMoth;
    }

}

