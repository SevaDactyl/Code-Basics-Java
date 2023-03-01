/*
Реализуйте метод getNumberExplanation(), который принимает на вход число и возвращает объяснение этого числа. Если для числа нет объяснения, то возвращается null:

App.getNumberExplanation(8);   // null

// Объяснения есть только для указанных ниже чисел
App.getNumberExplanation(666); // "devil number"
App.getNumberExplanation(42);  // "answer for everything"
App.getNumberExplanation(7);   // "prime number"
*/


public class App {
    // BEGIN (write your solution here)
    public static String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 7:
                return "prime number";
            case 42:
                return "answer for everything";
            default:
                return null;
        }
    }
    // END
}
