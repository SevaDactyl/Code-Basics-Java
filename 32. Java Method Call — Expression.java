/*
Выведите на экран первую и последнюю буквы предложения, записанного в переменную text, в следующем формате:

First: N
Last: t
Постарайтесь создать только одну переменную, в которую сразу запишется нужный текст перед печатью на экран. В этом уроке мы отрабатываем умение собирать составное выражение.
*/


public class App {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN
        var result = "First: "
            + text.charAt(0)
            + "\nLast: "
            + text.charAt(text.length() - 1);

        System.out.println(result);
        // END
    }
}
