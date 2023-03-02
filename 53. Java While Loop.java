/*
Модифицируйте метод printNumbers() так, чтобы она выводила числа в обратном порядке. Для этого нужно идти от верхней границы к нижней. То есть счётчик должен быть инициализирован максимальным значением, а в теле цикла его нужно уменьшать до нижней границы.

Пример вызова и вывода:

printNumbers(4);
4
3
2
1
finished!
*/


public class App {
    public static void printNumbers(int firstNumber) {
        // BEGIN (write your solution here)
            int i = firstNumber;
            while (i > 0) {
                System.out.println(i);
                i -= 1;
            }
        System.out.println("finished!");
        // END
    }
}
