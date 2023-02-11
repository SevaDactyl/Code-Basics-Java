/*
В переменной emoji находится текстовый грустный смайлик -(. Ваша задача — сделать этот смайлик веселым с помощью двух преобразований:

Добавить слева глаза :
Заменить ( на ) (с помощью метода строки replace())
Должно получиться: :-). Выведите его на экран.
*/


public class App {
    public static void main(String[] args) {
        var emoji = ":-(";
        // BEGIN (write your solution here)
        emoji = ":-(".replace("(", ")");
        System.out.println(emoji);
        // END
    }
}
