import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        scanner.close();

        // Удаление гласных из строки
        String result = removeVowels(input);

        // Вывод результата
        System.out.println("Строка без гласных: " + result);
    }

    public static String removeVowels(String input) {
        // Создаем регулярное выражение для поиска гласных букв
        String regex = "[aeiouAEIOU]";
        // Заменяем все гласные буквы на пустую строку
        String result = input.replaceAll(regex, "");
        return result;
    }
}
