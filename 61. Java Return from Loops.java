/*
Реализуйте статический метод App.hasChar(), который проверяет (с учётом регистра), содержит ли строка указанную букву. Метод принимает два параметра:

Строка
Буква для поиска
App.hasChar("Renly", 'R'); // true
App.hasChar("Renly", 'r'); // false
App.hasChar("Tommy", 'm'); // true
App.hasChar("Tommy", 'd'); // false
*/


public class App {
    public static boolean hasChar(String str, char ch) {
        // BEGIN (write your solution here)
        if (str.indexOf(ch) != -1) {
            return true;
        } else {
            return false;
        }
        // END
    }
}
