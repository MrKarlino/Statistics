package ru.netology.stats;

public class StatsService {
    int[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    int GetSalesSum() {
        int sum = 0;
        for (int sale : salesArray) {
            sum += sale;
        }
        return sum;
    }

    int GetSalesAverage() {
        if (salesArray.length == 0){
            return 0;
        }
        int sum = GetSalesSum();
        return sum / salesArray.length;
    }

    int GetMaxSaleMonth() {
        int result = 0;
        int lastValue = 0;
        for (int i = 0; i < salesArray.length; i++) {
            int value = salesArray[i];
            if (value >= lastValue) {
                lastValue = value;
                result = i;
            }
        }
        return result;
    }

    int GetMinSaleMonth() {
        int result = 0;
        int lastValue = GetMaxSaleValue();
        for (int i = 0; i < salesArray.length; i++) {
            int value = salesArray[i];
            if (value <= lastValue) {
                lastValue = value;
                result = i;
            }
        }
        return result;
    }

    int GetUndersaleMonthCount() {
        int average = GetSalesAverage();
        int result = 0;
        for(int sale : salesArray) {
            if (sale < average) {
                result++;
            }
        }
        return result;
    }

    int GetOversaleMonthCount() {
        int average = GetSalesAverage();
        int result = 0;
        for(int sale : salesArray) {
            if (sale > average) {
                result++;
            }
        }
        return result;
    }

    private int GetMaxSaleValue() {
        int result = 0;
        for(int sale : salesArray) {
            if (sale > result) {
                result = sale;
            }
        }
        return result;
    }
}
