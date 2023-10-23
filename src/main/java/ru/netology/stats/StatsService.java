package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int totalAmount(int[] sales) {
        int sum = 0; // изначальная сумма

        for (int sale : sales) {
            sum += sale;
        }
        return sum; // сумма всех продаж
    }

    public int averageAmount(int[] sales) {
        int sum = 0; // изначальная сумма

        for (int sale : sales) {
            sum += sale;
        }
        return sum / 12; // средняя сумма
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSalesMonth(int[] sales) {
        int months = 0; // счетчик месяцев
        int mid = averageAmount(sales); // среднее значение продаж

        for (int sale : sales)
            if (sale > mid) {
                months++;
            }
        return months;
    }

    public int maxSalesMonth(int[] sales) {
        int months = 0; // счетчик месяцев
        int mid = averageAmount(sales); // среднее значение продаж

        for (int sale : sales)
            if (sale < mid) {
                months++;
            }
        return months;
    }
}



