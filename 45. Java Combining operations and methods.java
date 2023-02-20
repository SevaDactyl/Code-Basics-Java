/*
Реализуйте метод isInternationalPhone(), который проверяет формат указанного телефона. Если телефон начинается с +, значит это международный формат.

App.isInternationalPhone("89602223423"); // false
App.isInternationalPhone("+79602223423"); // true
*/


public class App {
    // BEGIN (write your solution here)
    public static boolean isInternationalPhone (String number) {
    String firstNumber = number.substring(0,1);
    boolean comparison = firstNumber.equals("+");
    return comparison;
    }
    // END
}
