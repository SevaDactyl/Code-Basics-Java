/*
Реализуйте статический метод App.printReversedNameBySymbol(), который печатает переданное слово посимвольно, как в примере из теории, но делает это в обратном порядке.

var name = "Arya";
App.printReversedNameBySymbol(name);
// 'a'
// 'y'
// 'r'
// 'A'
*/


public class App {
    public static void printReversedNameBySymbol(String name) {
        // BEGIN (write your solution here)
        var i = name.length() - 1;
        while (i >= 0) {
            System.out.println(name.charAt(i));
            i--;
        }
        // END
    }
}
