package Java.Hwork4;
/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.*/

import java.util.ArrayDeque;
import java.util.Scanner;

public class task1 {

    public static int inputInteger() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = iScanner.nextInt();
        iScanner.close();
        return number;
    }

    public static ArrayDeque<Integer> reverseDeque(ArrayDeque<Integer> deque, int count) {
        ArrayDeque<Integer> reverseDeque = new ArrayDeque<>();
        for (int i = 0; i < count; i++) {
            reverseDeque.addFirst(deque.getFirst());
            deque.removeFirst();
        }
        return reverseDeque;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int num = 0;
        int count = inputInteger();

        for (int i = 0; i < count; i++) {
            num = (int) ((Math.random() * 10) + 1);
            deque.addFirst(num);
        }
        System.out.println(deque);
        System.out.println(reverseDeque(deque, count));
    }
}
