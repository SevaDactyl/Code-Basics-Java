/*
Реализуйте метод getSentenceTone(), которая принимает строку и определяет тон предложения. Если все символы в верхнем регистре, то это вопль — scream. В ином случае — нормальное предложение — normal.

Примеры вызова:

App.getSentenceTone("Hello"); // "normal"
App.getSentenceTone("WOW");  // "scream"
Алгоритм:

Сгенерируйте строку в верхнем регистре на основе строки-аргумента с помощью toUpperCase().
Сравните её с исходной строкой:
Если строки равны, значит, строка-аргумент в верхнем регистре
В ином случае — строка-аргумент не в верхнем регистре
*/


public class App {
    // BEGIN (write your solution here)
    public static String getSentenceTone(String sentence) {
        if (sentence.toUpperCase().equals(sentence)) {
            return "scream";
        }

        return "normal";
    }
    // END
}
