package ru.netology.stats.StatsService.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void salesSum() {
        StatsService service = new StatsService();
        long expectedSum = 180;
        long actualSum = service.salesSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
        System.out.println("Сумма всех продаж: " + actualSum);
    }
    @Test
    void averageSum() {
        StatsService service = new StatsService();
        long expectedAverageSum = 15;
        long actualAverageSum = service.averageSalesSum(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
        System.out.println("Средняя сумма продаж в месяц: " + actualAverageSum);
    }
    @Test
    void numberOfMonthWhereMaxSales() {
        StatsService service = new StatsService();
        long expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
        System.out.println("Номер месяца с пиком продаж: " + actualMaxSales);
    }
    @Test
    void numberOfMonthWhereMinSales() {
        StatsService service = new StatsService();
        long expectedMinSales = 9;
        long actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
        System.out.println("Номер месяца с минимумом продаж: " + actualMinSales);
    }
    @Test
    void amountOfMonthsWhereSalesBeforeAverage() {
        StatsService service = new StatsService();
        long expectedMonthsAmountBeforeAverage = 5;
        long actualMonthsAmountBeforeAverage = service.monthsWhereSalesBeforeAverage(sales);
        Assertions.assertEquals(expectedMonthsAmountBeforeAverage, actualMonthsAmountBeforeAverage);
        System.out.println("Количество месяцев с продажами ниже среднего: " + actualMonthsAmountBeforeAverage);
    }
    @Test
    void amountOfMonthsWhereSalesAboveAverage() {
        StatsService service = new StatsService();
        long expectedMonthsAmountAboveAverage = 5;
        long actualMonthsAmountAboveAverage = service.monthsWhereSalesAboveAverage(sales);
        Assertions.assertEquals(expectedMonthsAmountAboveAverage, actualMonthsAmountAboveAverage);
        System.out.println("Количество месяцев с продажами выше среднего: " + actualMonthsAmountAboveAverage);
    }
}
