package ru.netology.stats;

public class StatsService {
    int getSalesSum(int[] salesArray) {
        int sum = 0;
        for (int sale : salesArray) {
            sum += sale;
        }
        return sum;
    }

    int getSalesAverage(int[] salesArray) {
        if (salesArray.length == 0){
            return 0;
        }
        int sum = getSalesSum(salesArray);
        return sum / salesArray.length;
    }

    int getMaxSaleMonth(int[] salesArray) {
        int result = 0;
        int lastValue = 0;
        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] >= lastValue) {
                lastValue = salesArray[i];
                result = i;
            }
        }
        return result;
    }

    int getMinSaleMonth(int[] salesArray) {
        int result = 0;
        int lastValue = getMaxSaleValue(salesArray);
        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] <= lastValue) {
                lastValue = salesArray[i];
                result = i;
            }
        }
        return result;
    }

    int getUndersaleMonthCount(int[] salesArray) {
        int average = getSalesAverage(salesArray);
        int result = 0;
        for(int sale : salesArray) {
            if (sale < average) {
                result++;
            }
        }
        return result;
    }

    int getOversaleMonthCount(int[] salesArray) {
        int average = getSalesAverage(salesArray);
        int result = 0;
        for(int sale : salesArray) {
            if (sale > average) {
                result++;
            }
        }
        return result;
    }

    private int getMaxSaleValue(int[] salesArray) {
        int result = 0;
        for(int sale : salesArray) {
            if (sale > result) {
                result = sale;
            }
        }
        return result;
    }
}
