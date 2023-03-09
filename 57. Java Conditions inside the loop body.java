/*
Метод из теории учитывает регистр букв. То есть A и a с его точки зрения разные символы. Реализуйте вариант этого же метода, так чтобы регистр букв был не важен:

App.countChars("HexlEt", 'e'); // 2
App.countChars("HexlEt", 'E'); // 2
Character.toLowerCase() – переводит символ в нижний регистр
*/


public class App {
    public static int countChars(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                count++;
            }
            i++;
       }
       return count;
        // END
    }
}
