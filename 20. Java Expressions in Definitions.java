/*
Напишите программу, которая берет исходное количество евро, записанное в переменную eurosCount, переводит евро в доллары и выводит на экран. Затем полученное значение переводит в рубли и выводит на новой строчке.

Пример вывода для 100 евро:

125.0
7500.0
Считаем, что:

1 евро = 1.25 долларов
1 доллар = 60 рублей
*/


public class App {
    public static void main(String[] args) {
        var eurosCount = 100;
        // BEGIN (write your solution here)
        var euroPerDollar = 1.25;
        var dollarsCount = 60 * 1.25;
        var rublesPerDollar = 60;
        System.out.println(eurosCount * euroPerDollar);
        System.out.println(eurosCount * dollarsCount);
        // END
    }
}
