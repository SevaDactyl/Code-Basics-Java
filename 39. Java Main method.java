/*
Реализуйте класс с именем App и двумя методами:

Метод gogo(), который печатает на экран строку It works!
main(), как в определении выше, который вызывает метод gogo()
Результат вызова main() в таком случае будет таким:

// => "It works!"
*/


public class App {
    // BEGIN (write your solution here)
    public static void gogo() {
        System.out.println("It works!");
    }
    
    public static void main(String[] args) {
        App.gogo();
    }
}
// END
