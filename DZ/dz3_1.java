// package DZ;

// public class dz3_1 {
    
// }
// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

// Пример


// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

import java.util.Arrays;
import java.util.*;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
            Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz3_1{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}