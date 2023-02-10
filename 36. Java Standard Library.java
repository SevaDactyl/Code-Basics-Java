/*
Напишем код в стиле "повтори за учителем". Рассчитаем количество дней между двумя датами используя встроенные возможности Java. Попробуйте "поиграть" с датами.

// С даты
LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
// По дату
LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
// Количество дней между этими датами
long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
System.out.println(noOfDaysBetween);
*/


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        // BEGIN
        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
        // END
    }
}
