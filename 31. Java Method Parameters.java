/*
Вам даны три переменные с фамилиями разных людей. Составьте и выведите на экран слово из символов в таком порядке:

третий символ из первой строки;
второй символ из второй строки;
четвертый символ из третьей строки;
пятый символ из второй строки;
третий символ из второй строки.
Вывод результата должен быть примерно в таком виде:

a b c d e
*/


public class App {
    public static void main(String[] args) {
        var one = "Naharis";
        var two = "Mormont";
        var three = "Sand";

        // BEGIN
        var char1 = one.charAt(2);
        var char2 = two.charAt(1);
        var char3 = three.charAt(3);
        var char4 = two.charAt(4);
        var char5 = two.charAt(2);

        System.out.println(
                char1 + " " + char2 + " " + char3 + " " + char4 + " " + char5
                );
        // END
    }
}
