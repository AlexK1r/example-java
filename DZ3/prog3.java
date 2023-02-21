// 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
// среднее арифметическое из этого списка.
// 2 Пусть дан произвольный список целых чисел, удалить из него четные числа
// 3* Реализовать алгоритм сортировки слиянием
// Формат сдачи: файл с расширением java или ссылка на гит

package DZ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class prog3 {
        
    public static int getRandomInt(int upperRange){ //генератор чисел
        Random random = new Random();
        return random.nextInt(upperRange);
    }
    
    

       
    public static void main(String[] args) {  // заполняем массив числами
        int maxArray = 10;                    // "начальный(максимальный)" размер списка
        int upperRange = 100;                 // верхний предел рандома
        List<Integer> listA = new ArrayList<Integer>();
        for (int i = 0; i < maxArray; i++) {
            int temp = getRandomInt(upperRange);
            listA.add(temp);
        }

        System.out.printf("Список: %s\n", listA);

        int min = listA.get(0);
        int max = listA.get(0);
        int summNumListA = 0;

        for (Integer i: listA) {     //поиск мин, макс значения в списке, вычисление суммы
            if(i < min) 
                min = i;
            if(i > max) 
                max = i;
            summNumListA += i;
        }
            
        System.out.printf("\nМинимальное число в списке: %s\n" +
                            "Максимальное число в списке: %s\n" +                            
                            "Среднее арифметическое число из списка: %s\n", 
                            min, max, summNumListA/maxArray);
        
        List<Integer> listB = new ArrayList<Integer>();
        for (int i = 0; i < maxArray; i++)  {   //удаление четных чисел. результат в новый список
            if (listA.get(i) % 2 != 0) {
                listB.add(listA.get(i));
            }
        }
        System.out.printf("\nЧетные числа удалены!\n\nНовый список: %s\n", listB);
    }
}
