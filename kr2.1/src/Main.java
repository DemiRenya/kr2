import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив значений в формате [1, 0, 1, 1, 1]:");
        String input = scanner.nextLine().trim(); // Считываем строку с клавиатуры
        scanner.close();

        // Удаляем лишние символы из строки
        input = input.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");

        // Разбиваем строку на массив строк, используя запятую как разделитель
        String[] values = input.split(",");

        // Счетчик сотрудников
        int employeesCount = 0;

        // Проходим по каждому значению в массиве
        for (String value : values) {
            // Преобразуем значение в логический тип
            boolean isEmployee = value.equals("1");

            // Если это работник (true), увеличиваем счетчик
            if (isEmployee) {
                employeesCount++;
            }
        }

        // Выводим результат
        System.out.println("Количество сотрудников: " + employeesCount);
    }
}