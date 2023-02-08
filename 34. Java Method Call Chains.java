/*
Напишите код, который берет данные из переменной name и выполняет капитализацию. В программировании так называют операцию, которая делает заглавной первую букву в слове, а все остальные переводит в нижний регистр. Например: heXlet => Hexlet. Программа должна выводить результат на экран.

Для извлечения частей слова, воспользуйтесь методом substring():

// 1 параметр – начальный индекс, 2 – конечный индекс (не включая)
"hexlet".substring(0, 1); // "h"
// По умолчанию до конца строки
"hexlet".substring(1); // "exlet"
*/


public class App {
    public static void main(String[] args) {
        var name = "hexlet";

        // BEGIN
        var capitalized = name.substring(0, 1).toUpperCase()
            + name.substring(1).toLowerCase();
        System.out.println(capitalized);
        // END
    }
}
