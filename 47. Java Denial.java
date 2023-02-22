/*
Реализуйте метод notToday(), который проверяет что переданная дата это не сегодняшнее число:

// предположим сегодня 2012-11-25
notToday("2012-11-25"); // false
notToday("2013-11-25"); // true
notToday("2013-09-01"); // true
Для получения текущей даты в виде строки: LocalDate.now().toString().
*/


import java.time.LocalDate;

public class App {
    // BEGIN (write your solution here)
    public static boolean notToday(String date) {
    	return !(date.equalsIgnoreCase(LocalDate.now().toString()));
    }
    // END
}
