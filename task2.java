package Java.Hwork4;

import java.util.ArrayDeque;
import java.util.Scanner;

/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.*/
public class task2 {
   
    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int number) {
        linkedList.addLast(number); 
        return linkedList;
    }

    public static int dequeue(ArrayDeque<Integer> linkedList,boolean flag) {
        int firstElement = linkedList.getFirst();
        if (flag==true) {
            linkedList.pollFirst();
        }
        return firstElement;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        System.out.print("Введите число: ");
        int count = iScanner.nextInt();
        for (int i = 0; i < count; i++) {
            int num = (int) ((Math.random() * 10) + 1);
            deque.addFirst(num);
        }

        System.out.println("Исходный LinkedList: "+ deque+"\n");
      
        System.out.print("Введите число для добавления в очередь: ");
        int element = iScanner.nextInt();
        iScanner.close();
        System.out.println("LinkedList после добавления элемента: " + enqueue(deque, element)+"\n");

        

        System.out.println("Удаленный элемент: " + dequeue(deque,true));
        System.out.println("LinkedList после удаления первого элемента: "+ deque + "\n");
        
        System.out.println("Первый элемент LinkedList: " + dequeue(deque,false));
        System.out.println("LinkedList после всех изменений: "+ deque+"\n");
    }
    
}