package by.tasks.алгоритмы;

public class Main_9 {
    public static void main(String[] args) {
        // Дан отсортированный массив. Вывести в log через пробел в порядке возрастания пропущенные в нём числа.
        int[] sortedArr = {1, 3, 7, 8, 10}; // 2  4 5 6  9
        missingNumbers(sortedArr);

    }
    public static void missingNumbers(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // Проходим до предпоследнего элемента
            int current = arr[i]; // Текущий элемент
            int next = arr[i + 1]; // Следующий элемент
            // Проверяем, пропущенные ли числа
            if (next - current > 1) {
                // Выводим пропущенные числа
                for (int val = current + 1; val < next; val++) {
                    System.out.print(val + " "); // Вывод в одной строке
                }
            }
        }
    }
}
