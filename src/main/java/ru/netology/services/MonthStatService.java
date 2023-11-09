package ru.netology.services;
public class MonthStatService {
    public long sumSales(long[] sales) {
        long allSumSales = 0;
        for (long i :sales) {
            allSumSales = i + allSumSales;
        }
        return allSumSales ;
    }
    public long averageSumSales(long[] sales) {
        return sumSales(sales)/sales.length ;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }



    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int quantityLowSales(long[] sales) {
        int quantity = 0; //

        for (long i  : sales) {
            if (i < averageSumSales(sales)) {
                quantity = quantity+1; //
            }
        }

        return quantity ;
    }
    public int quantityHighSales(long[] sales) {

        int quantity = 0; //

        for (long i  : sales) {
            if (i > averageSumSales(sales)) {
                quantity = quantity+1; //
            }
        }

        return quantity ;
    }
}

