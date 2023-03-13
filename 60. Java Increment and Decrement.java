/*
Реализуйте статический метод App.makeItFunny(), который принимает на вход строку и возвращает её копию, у которой каждый n-ный элемент переведен в верхний регистр. n – задается на входе в функцию. Для определения каждого n-ного элемента понадобится остаток от деления %. Подумайте, как его можно использовать.

var text = "I never look back";
// Каждый третий элемент
App.makeItFunny(text, 3); // "I NevEr LooK bAck"
*/


public class App {
    public static String makeItFunny(String str, int n) {
        // BEGIN (write your solution here)
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % n == 0) {
                newStr = newStr + Character.toString(str.charAt(i)).toUpperCase();
            } else {
                newStr = newStr + Character.toString(str.charAt(i));
            }
        }
        System.out.println(newStr);
return newStr;
    // END
    }
}
