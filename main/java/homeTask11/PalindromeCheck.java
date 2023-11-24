package homeTask11;

import java.util.ArrayList;
import java.util.List;

public interface PalindromeCheck {
    boolean isPalindrome(String s);
}
class PalindromeExample {
    public static void main(String[] args) {
        // Лямбда для проверки на палиндром
        PalindromeCheck palindromeChecker = s -> {
            String cleanString = s.replaceAll("[^а-яА-Яa]", "").toLowerCase();
            String reversedString = new StringBuilder(cleanString).reverse().toString();
            return cleanString.equals(reversedString);
        };
        List<String> strings = new ArrayList<>();
        strings.add("око");
        strings.add("дерево");
        strings.add("мадам");

        // Фильтрация списка и вывод палиндромов
        List<String> palindromes = filterPalindromes(strings, palindromeChecker);
        System.out.println("Палиндромы" + palindromes);
    }
    // Метод для фильтрации строк по предикату и возврата палиндромов
    private static List<String> filterPalindromes(List<String> strings, PalindromeCheck checker) {
        List<String> palindromes = new ArrayList<>();
        for (String s : strings) {
            if (checker.isPalindrome(s)) {
                palindromes.add(s);
            }
        }
        return palindromes;
    }
}
