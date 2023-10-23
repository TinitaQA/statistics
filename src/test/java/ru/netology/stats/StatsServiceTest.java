package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcMonthNumberWithTheMinimumAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinDay = 9;
        int actualMinDay = service.minSales(sales);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void shouldCalcAllAmount() {
        StatsService service = new StatsService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAllAmount = 180;
        int actualAllAmount = service.totalAmount(amount);

        Assertions.assertEquals(expectedAllAmount, actualAllAmount);
    }

    @Test
    public void shouldCalcAverageAmountPerMonth() {
        StatsService service = new StatsService();

        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageAmount(amount);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void shouldCalcMonthNumberWithTheMaximumAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxDay = 8;
        int actualMaxDay = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }
    @Test
    public void numberOfMonthsOfSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonths = 5;
        int actualMinMonths = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMinMonths, actualMinMonths);
    }

    @Test
    public void numberOfMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonths = 5;
        int actualMaxMonths = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxMonths, actualMaxMonths);
    }
}
