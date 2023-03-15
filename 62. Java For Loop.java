/*
Сэмвелл обнаружил, что его сообщения перехватываются в замке «Близнецы» и там читаются. Из-за этого их атаки перестали быть внезапными. Немного подумав, он разработал программу, которая бы шифровала сообщения по следующему алгоритму. Она бы брала текст и переставляла в нем каждые два подряд идущих символа.

App.encrypt("move"); // "omev"
App.encrypt("attack"); // "taatkc"
// Если число символов нечётное
// то последний символ остается на своем месте
App.encrypt("go!"); // "og!"
Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение и возвращает зашифрованное.
*/


public class App {
    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            if (i <= str.length() - 2) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
        // END
    }
}
