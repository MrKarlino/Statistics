package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void getSalesSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.GetSalesSum();
        assertEquals(expected, actual);
    }

    @Test
    void getSalesAverage() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.GetSalesAverage();
        assertEquals(expected, actual);
    }

    @Test
    void getMaxSaleMonth() {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.GetMaxSaleMonth();
        assertEquals(expected, actual);
    }

    @Test
    void getMinSaleMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.GetMinSaleMonth();
        assertEquals(expected, actual);
    }

    @Test
    void getUndersaleMonthCount() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.GetUndersaleMonthCount();
        assertEquals(expected, actual);
    }

    @Test
    void getOversaleMonthCount() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.GetOversaleMonthCount();
        assertEquals(expected, actual);
    }
}