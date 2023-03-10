/*
Реализуйте такой же метод reverse(), но выполняющий обход строки не с первого элемента по последний, а наоборот, от последнего к первому. Общая структура функции при этом останется такой же. Изменится начальный индекс, условие окончания цикла, сборка новой строки и формирование нового индекса в цикле.
*/


public class App {
    public static String reverse(String str) {
        // BEGIN (write your solution here)
        int i = str.length() - 1;
        String result = "";
        while (i >= 0 ) {
            result = result + str.charAt(i);
            i--;
        }
        return result;
        // END
    }
}
