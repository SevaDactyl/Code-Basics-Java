/*
Реализуйте статический метод App.truncate(), который обрезает переданную строку до указанного количества символов, добавляет в конце многоточие и возвращает получившуюся строку. Подобная логика часто используется на сайтах, чтобы отобразить длинный текст в сокращенном виде. Метод принимает два параметра:

Строка (String), которую нужно обрезать
Число (int) символов, которые нужно оставить
Пример того, как должен работать написанный вами метод:

// Передаем текст напрямую
// Обрезаем текст, оставляя 2 символа
App.truncate("hexlet", 2); // he...

// Через переменную
var text = "it works!"
// Обрезаем текст, оставляя 4 символа
App.truncate(text, 4); // it w...
Реализовать этот метод можно различными способами, подскажем лишь один из них. Для решения этим способом вам понадобится взять подстроку из строки, переданной первым параметром в метод truncate(). Используйте для этого метод substring(). Подумайте, исходя из задания, с какого индекса и по какой вам надо извлечь подстроку?

  var text = "welcome";
  // Передавать параметры в метод можно через переменные
  var index = 3;
  text.substring(0, index); // wel
С точки зрения проверочной системы не имеет значения, каким из способов будет реализован метод truncate() внутри, главное – чтобы он выполнял поставленную задачу
*/


public class App {
    public static String truncate(String text, int length) {
        // BEGIN (write your solution here)
        return text.substring(0, length) + "...";
        // END
    }
}
