/*
Реализуйте метод isPensioner(), который принимает один параметр — возраст человека, и проверяет, является ли он пенсионным. Пенсионером считается человек, достигший возраста 60 лет и больше.

Примеры вызова:

App.isPensioner(75); // true
App.isPensioner(18); // false
*/


public class App {
    // BEGIN (write your solution here)
    public static boolean isPensioner(int age) {
        return age >= 60;
    }
    // END
}
