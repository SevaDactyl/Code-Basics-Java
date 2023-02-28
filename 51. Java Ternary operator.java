/*
Реализуйте метод convertString(), который принимает на вход строку и, если первая буква не заглавная, возвращает перевернутый вариант исходной строки. Если первая буква заглавная, то строка возвращается без изменений. Если на вход передана пустая строка, метод должен вернуть пустую строку.

App.convertString("Hello"); // "Hello"
App.convertString("hello"); // "olleh"

// Не забудьте учесть пустую строку!
App.convertString(""); // ""
StringUtils.reverse() – переворот строки
Character.isUpperCase() – проверка символа на верхний регистр
Попробуйте написать два варианта функции: с обычным if-else, и с тернарным оператором.
*/


import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN (write your solution here)
    public static String convertString(String string) {
        return string.equals("") ? "" : Character.isUpperCase(string.charAt(0)) ? string : StringUtils.reverse(string);
    }
    // END
}
