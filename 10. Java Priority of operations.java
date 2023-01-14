/*
Дано выражение 70 * 3 + 4 / 8 + 2.

Расставьте скобки так, чтобы оба сложения (3 + 4 и 8 + 2) высчитывались в первую очередь. Выведите результат на экран.
*/


public class App {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        System.out.println(70 * (3 + 4) / (8 + 2));
        // END
    }
}