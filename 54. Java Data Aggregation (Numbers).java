/*
Реализуйте метод multiplyNumbersFromRange(), который перемножает числа в указанном диапазоне включая границы диапазона. Пример вызова:

App.multiplyNumbersFromRange(1, 5); // 1 * 2 * 3 * 4 * 5 = 120
App.multiplyNumbersFromRange(2, 3); // 2 * 3 = 6
App.multiplyNumbersFromRange(6, 6); // 6
*/


public class App {
    public static int multiplyNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        var i = start;
        var result = 1;
        while (i <= finish) {
            result = result * i;
            i += 1;
        }
        return result;
        // END
    }
}
