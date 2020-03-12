package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void testSalesSum() {
        StatsService service = new StatsService();
        int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSalesSum(salesArray);
        assertEquals(expected, actual);
    }

    @Test
    void testSalesAverage() {
        StatsService service = new StatsService();
        int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getSalesAverage(salesArray);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxSaleMonth() {
        StatsService service = new StatsService();
        int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.getMaxSaleMonth(salesArray);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSaleMonth() {
        StatsService service = new StatsService();
        int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMinSaleMonth(salesArray);
        assertEquals(expected, actual);
    }

    @Test
    void testUndersaleMonthCount() {
        StatsService service = new StatsService();
        int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getUndersaleMonthCount(salesArray);
        assertEquals(expected, actual);
    }

    @Test
    void testOversaleMonthCount() {
        StatsService service = new StatsService();
        int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getOversaleMonthCount(salesArray);
        assertEquals(expected, actual);
    }
}
