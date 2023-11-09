package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MonthServicetTest {

    @Test
    public void sumSalesTest() {
        MonthStatService service = new MonthStatService();


        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 180;
        // вызываем целевой метод:
        long actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSalesTest() {
        MonthStatService service = new MonthStatService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 15;
        // вызываем целевой метод:
        long actual = service.averageSumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSalesTest() {
        MonthStatService service = new MonthStatService();


        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 8;
        // вызываем целевой метод:
        long actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        MonthStatService service = new MonthStatService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 9;
        // вызываем целевой метод:
        long actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityLowSalesTest() {
        MonthStatService service = new MonthStatService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 5;
        // вызываем целевой метод:
        long actual = service.quantityLowSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityHighSales() {
        MonthStatService service = new MonthStatService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 5;
        // вызываем целевой метод:
        long actual = service.quantityHighSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


}


