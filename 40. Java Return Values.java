/*
Реализуйте статический метод sayHurrayThreeTimes(), которая возвращает строку 'hurray! hurray! hurray!'.

var hurray = App.sayHurrayThreeTimes();
System.out.println(hurray); // => hurray! hurray! hurray!
*/


public class App {
    // BEGIN (write your solution here)
    public static String sayHurrayThreeTimes() {
        var hurray = "hurray! hurray! hurray!";
        return hurray;

    }
    public static void main(String[] args) {
        var hurray = App.sayHurrayThreeTimes();
        System.out.println(hurray);
    }
    // END
    }
