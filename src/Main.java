/*  5.94. Дано шестизначное число. Найти сумму его цифр. Величины для хранения
        всех шести цифр числа не использовать.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 6-значное число: ");
        int sixDigit = scanner.nextInt();
        if (getNumDigits(sixDigit) == 6) {
            System.out.println(sumDigits(sixDigit));
        } else {
            System.out.println("Неа");
        }
    }

    /* Найти количество цифр в числе используя целочисленное деление */
    static int getNumDigits(int num) {
        int ctr = 0;
        while (num > 0) {
            num /= 10;
            ctr++;
        }
        return ctr;
    }

    /*  Можно совместить два цикла но уже написал.
        Переменные sum и num у меня подчеркиваются Reassigned local variable
        Почему такое предупреждение? Параметры же передаются по значению
        Плюс я не понимаю почему у sum та же проблема, я с таким впервые столкнулся
    */
    static int sumDigits(int num) {
        int numDigits = getNumDigits(num);
        int sum = 0;
        for (int i = 0; i < numDigits; i++) {
            sum += num % 10;
            num = (num - num % 10) / 10;
        }
        return sum;
    }
}

