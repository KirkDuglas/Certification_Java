// package DZ;

// public class DZ3_2 {
    
// }

// Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
// Примеры.
// Исходный массив:

// 1, 2, 3, 4, 5, 6, 7, 8, 9
// Результат:

// [1, 3, 5, 7, 9]
// Исходный массив:

// 2, 4, 6, 8
// Результат:

// []

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже

      for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
        Integer number = iterator.next();
        if (number % 2 == 0) {
            iterator.remove();
        }

    }
    System.out.println(list.toString());
    return list;
}

public static void main(String[] args) {
    deletEvenNum(getRandomList());
       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}