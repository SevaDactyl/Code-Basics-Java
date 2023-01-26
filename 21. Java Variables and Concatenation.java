/*
Сайты постоянно посылают письма своим пользователям. Типичная задача — сделать автоматическую отправку персонального письма, где в заголовке будет имя пользователя. Если где-то в базе сайта хранится имя человека в виде строки, то задача генерации заголовка сводится к конкатенации: например, нужно склеить строку Здравствуйте со строкой, где записано имя.

Напишите программу, которая будет генерировать заголовок и тело письма, используя уже готовые переменные, и выводить получившиеся строки на экран.

Для заголовка используйте переменные firstName и greeting, запятую и восклицательный знак. Выведите это на экран в правильном порядке.

Для тела письма используйте переменные info и intro, при этом второе предложение должно быть на новой строке.

Результат на экране будет выглядеть так:

Hello, Joffrey!
Here is important information about your account security.
We couldn't verify you mother's maiden name.
Выполните задание, используя только два System.out.println().
*/


public class App {
    public static void main(String[] args) {
        var info = "We couldn't verify you mother's maiden name.";
        var intro = "Here is important information about your account security.";

        var firstName = "Joffrey";
        var greeting = "Hello";

        // BEGIN (write your solution here)
        System.out.println(greeting + ", " + firstName + "!");
        System.out.print(intro + "\n" + info );
        // END
    }
}
