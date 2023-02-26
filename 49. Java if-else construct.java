/*
Реализуйте метод normalizeUrl(), который выполняет так называемую нормализацию данных. Он принимает адрес сайта и возвращает его с https:// в начале.

Метод принимает адреса в виде АДРЕС или https://АДРЕС, но всегда возвращает адрес в виде https://АДРЕС

Можно использовать метод startsWith() чтобы проверить начинается ли строка с префикса https://. А потом на основе этого добавлять или не добавлять https://.

App.normalizeUrl("google.com"); // "https://google.com"
App.normalizeUrl("https://ai.fi"); // "https://ai.fi"
*/


public class App {
    // BEGIN (write your solution here)
    public static String normalizeUrl(String webAddress) {
        if (webAddress.startsWith("https://")) {
            return webAddress;
        } else {
            return "https://" + webAddress;
        }
    }
    // END
}
