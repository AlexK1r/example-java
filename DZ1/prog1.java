// 1. Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2. Вывести все простые числа от 1 до 1000
// 3. Реализовать простой калькулятор
// 4.*Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

package DZ1;
import java.util.Scanner;
/**
 * prog1
 */
public class prog1 {

    public static void main(String[] args) {
        
        {   // Задача 1
            System.out.println("Задача 1: Вычислить n-ое треугольное число(сумма чисел от 1 до n)\n и n! (произведение чисел от 1 до n)");
            System.out.print("Введите число n: ");
            int n = new Scanner(System.in).nextInt();
            int number = 1;
            for (int i = 2; i <= n; i++) number += i;
            System.out.println("Ответ: треугольное число от n = " + number);
            System.out.println("Ответ: n! = " + getFactorial(n));
        }      
        
        {   // Задача 2
            System.out.print("Поиск простых чисел от 1 до N, введите N:");
            int n = new Scanner(System.in).nextInt();
            System.out.println("Простые числа от 1 до N: " + simpleNumber(n));
        }
        
        {   // Задача 3
            System.out.println("Введите выражение, формат:  X + Y ENTER");
            String stringExpr = new Scanner(System.in).nextLine();
            System.out.printf("%s = %s\n", stringExpr, simpleCalc(stringExpr));
        }       

    }

    public static int getFactorial(int n) { //Поиск факториала рекурсией
        if (n <= 1) {
           return 1;
        }
        else {
           return n * getFactorial(n - 1);
        }
      }
    

    static boolean testNumber(int n) {// проверка числа      
        int i = 2;
        while (n % i != 0 && i < n)
            i++;
        return (i == n);
    }

    public static StringBuilder simpleNumber(int n) {//собираем полученные числа в строку  
        StringBuilder resuls = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (testNumber(i)) {
                resuls.append(String.valueOf(i));
                resuls.append(',');
            }
        }
        resuls.deleteCharAt(resuls.length() - 1);
        return resuls;
    }

    
    public static double simpleCalc(String stringExpr) {
        // простой калькулятор
        class InvalidCommand extends Exception {}//класс исключения для исключения неверного ввода        
        
        double a, b, result;
        char command;
        String[] exprArray = stringExpr.split(" ");
        try {
            a = Double.parseDouble(exprArray[0]);
            b = Double.parseDouble(exprArray[2]);
            command = exprArray[1].charAt(0);

            result = switch (command) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> a / b;
                default -> throw (new InvalidCommand());
            };

            return (result);

        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
            throw (new RuntimeException(e));
        } catch (InvalidCommand e) {
            System.out.println("Неправильная арифметическая команда");
            throw (new RuntimeException(e));
        }
    }

}
