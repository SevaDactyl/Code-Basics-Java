/*
Реализуйте метод isPalindrome(), который определяет, является ли слово палиндромом или нет. Палиндром это слово, которое читается одинаково в обоих направлениях.

App.isPalindrome("шалаш"); // true
App.isPalindrome("ага"); // true
App.isPalindrome("хекслет"); // false

// Слова в метод могут быть переданы в любом регистре
App.isPalindrome("Ага"); // true
Для определения палиндрома, необходимо перевернуть строку и сравнить ее с исходной. Для этого воспользуйтесь методом StringUtils.reverse()

StringUtils.reverse("мама"); // "амам"
*/


import org.apache.commons.lang3.StringUtils;

public class App {
    // BEGIN (write your solution here)
    public static boolean isPalindrome(String text) {
    var tet = text; 
    tet = StringUtils.reverse(tet.toLowerCase()); 
    return text.equalsIgnoreCase(tet); 
    }
    // END
}
