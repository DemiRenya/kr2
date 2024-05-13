import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] distances = {50, 55, 57, 58, 60};
        int maxDistance = 163;
        int citiesToVisit = 3;

        int result = chooseBestSum(maxDistance, citiesToVisit, distances);
        System.out.println("Максимальная сумма расстояний: " + result);
    }

    public static int chooseBestSum(int maxDistance, int citiesToVisit, int[] distances) {
        // Инициализируем переменную для хранения максимальной суммы расстояний
        int maxSum = -1;

        // Вызываем рекурсивную функцию для поиска максимальной суммы расстояний
        maxSum = findMaxSum(distances, citiesToVisit, maxDistance, 0, 0, maxSum);

        return maxSum;
    }

    private static int findMaxSum(int[] distances, int citiesToVisit, int maxDistance, int currentIndex, int currentSum, int maxSum) {
        // Если уже посетили нужное количество городов, возвращаем текущую сумму
        if (citiesToVisit == 0) {
            return currentSum;
        }

        // Перебираем все возможные комбинации городов
        for (int i = currentIndex; i < distances.length; i++) {
            // Если расстояние до текущего города не превышает максимальное допустимое расстояние
            if (currentSum + distances[i] <= maxDistance) {
                // Рекурсивно вызываем функцию для следующего города
                int sum = findMaxSum(distances, citiesToVisit - 1, maxDistance, i + 1, currentSum + distances[i], maxSum);
                // Обновляем максимальную сумму, если полученная сумма больше текущей максимальной
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
