package ru.netology.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class SalesServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    SalesService service = new SalesService();

    @Test
    public void testSumSales() {
        long actual = service.sumSales(sales);
        long expected = 180;
        assertEquals(actual, expected);
    }

    @Test
    public void testAverageIncome() {
        long actual = service.averageIncome(sales);
        long expected = 15;
        assertEquals(actual, expected);
    }

    @Test
    public void testMaxSales() {
        int actual = service.maxSales(sales);
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    public void testMinSales() {
        int actual = service.minSales(sales);
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void testBelowAverage() {
        int actual = service.belowAverage(sales);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void testAboveAverage() {
        int actual = service.aboveAverage(sales);
        int expected = 5;
        assertEquals(actual, expected);
    }
}

