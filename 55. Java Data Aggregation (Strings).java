/*
Реализуйте метод joinNumbersFromRange(), который объединяет все числа из диапазона в строку:

App.joinNumbersFromRange(1, 1); // "1"
App.joinNumbersFromRange(2, 3); // "23"
App.joinNumbersFromRange(5, 10); // "5678910"
*/


public class App {
    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
            String result = "";
            for (int i = start;i <= finish;i++){
                result = result + Integer.toString(i);
            }
            return result;
    }
        // END
}
