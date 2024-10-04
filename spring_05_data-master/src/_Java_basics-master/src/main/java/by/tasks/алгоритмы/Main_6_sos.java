package by.tasks.алгоритмы;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main_6_sos {
    public static void main(String[] args) {
        //Дан массив интервалов intervals, где каждый интервал — это массив из двух чисел [start, end].
//Объедините перекрывающиеся интервалы и верните массив непересекающихся интервалов.

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};// -> [[1,6],[8,10],[15,18]]

        int[][] mergedIntervals = merge(intervals);
// Вывод объединённых интервалов
        for (int[] interval : mergedIntervals) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        // -> [[1, 6], [8, 10], [15, 18]]
    }

    public static int[][] merge(int[][] intervals) {
        // Сначала сортируем интервалы по началу
        // можно пропустить тк они отсортированы
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

        // Список для хранения объединённых интервалов
        List<int[]> arr = new ArrayList<>();

        // Начинаем с первого интервала
        int[] currentInterval = intervals[0];
        arr.add(currentInterval);

        // Проходим по всем интервалам
        for (int[] interval : intervals) {
            int start = interval[0]; // 3
            int end = interval[1];  // 1

            // Если интервалы перекрываются, обновляем конец текущего интервала
            if (currentInterval[1] >= start) { //2 >=3
                currentInterval[1] = Math.max(currentInterval[1], end);
            } else {
                // Если не перекрываются, добавляем новый интервал
                currentInterval = interval;
                arr.add(currentInterval);
            }
        }

        // Преобразуем список обратно в массив
        return arr.toArray(new int[arr.size()][]);
    }
}

//Мы обрабатываем их по порядку после сортировки.
//
//- **Сравнение интервалов 1 и 2**:
//- Интервал A: \([1, 3]\)
//- Интервал B: \([2, 6]\)
//
//Проверяем:
//- `endA >= startB` (3 >= 2) - true
//- `startA <= endB` (1 <= 6) - true
//
//Так как обе проверки истинны, интервалы перекрываются. Мы можем объединить их в один интервал:
//- Новый интервал: \([1, max(3, 6)]\) → \([1, 6]\)
//  **Сравнение интервалов 2 и 3**:
//- Интервал A: \([1, 6]\) (объединённый интервал)
//- Интервал B: \([8, 10]\)
//
//Проверяем:
//- `endA >= startB` (6 >= 8) - false
//- `startA <= endB` (1 <= 10) - true
//Так как первое выражение ложно, интервалы не перекрываются. Мы добавляем интервал \([8, 10]\) как новый.
//
//- **Сравнение интервалов 3 и 4**:
//- Интервал A: \([8, 10]\)
//- Интервал B: \([15, 18]\)
//
//Проверяем:
//- `endA >= startB` (10 >= 15) - false
//- `startA <= endB` (8 <= 18) - true
//
//Интервалы не перекрываются, и добавляем \([15, 18]\) как новый.
//
//Итак, финальная комбинация будет:
//- Объединённые интервалы: \([[1, 6], [8, 10], [15, 18]]\).