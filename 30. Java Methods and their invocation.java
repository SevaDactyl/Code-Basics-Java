/*
В коде программы определены две переменные, содержащие имена компаний. Посчитайте их общую длину в символах и выведите ее на экран.
*/


public class App {
    public static void main(String[] args) {
        var company1 = "Apple";
        var company2 = "Samsung";

        // BEGIN
        var company1Length = company1.length();
        var company2Length = company2.length();

        System.out.println(company1Length + company2Length);
        // END
    }
}