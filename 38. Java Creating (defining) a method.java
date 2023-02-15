/*
Реализуйте статический метод с именем printMotto(), который выведет на экран фразу Winter is coming.

// Класс App уже определен
App.printMotto(); // => Winter is coming
Чтобы мы могли вызвать этот метод снаружи, нужно его пометить не только ключевым словом static, но еще и public.

В задачах, в которых нужно реализовать метод, этот метод вызывать не нужно. Вызывать метод будут автоматизированные тесты, которые проверяют его работоспособность. Пример с вызовом выше показан только для того, чтобы вы понимали, как ваш метод будет использоваться.
*/


public class App {
    // BEGIN (write your solution here)
    public static void printMotto() {
        System.out.println("Winter is coming");
    }
    // END
}