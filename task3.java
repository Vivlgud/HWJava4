package Java.Hwork4;

import java.util.Scanner;
import java.util.Stack;

/* В калькулятор добавьте возможность отменить последнюю операцию.*/

public class task3 {

    public static void counting(Stack<Integer> stack, String action) {
        int result = 0;
        String space = " ";
        int numSecond = stack.pop();
        int numFirst = stack.pop();
        String print = numFirst + space + action + space + numSecond + " = ";

        switch (action) {
            case "+":
                result = numFirst + numSecond;
                System.out.println(print + result);
                stack.push(numFirst);
                break;
            case "-":
                result = numFirst - numSecond;
                System.out.println(print + result);
                stack.push(numFirst);
                break;
            case "*":
                result = numFirst * numSecond;
                System.out.println(print + result);
                stack.push(numFirst);
                break;
            case "/":
                if (numSecond != 0) {
                    double result1 = (double) numFirst / (double) numSecond;
                    System.out.println(print + result1);
                    stack.push(numFirst);
                    break;
                } else {
                    System.out.println("Делить на ноль нельзя.");
                    break;
                }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            stack.push(scanner.nextInt());
            System.out.print("Введите второе число: ");
            stack.push(scanner.nextInt());
            System.out.print("Введите арифметическое действие (+,-,*,/): ");
            String action = scanner.next();
            counting(stack, action);
            Boolean flag = false;

            while (flag == false) {
                System.out.println("Отменить операцию?");
                System.out.print("Введите 'y', если да, 'n', если нет. 'q', для выхода из программы. ");
                String choice = scanner.next();

                if (choice.equals("y")) {
                    System.out.println("Первое число: " + stack.peek());
                    System.out.printf("Введите второе число: ");
                    stack.push(scanner.nextInt());
                    System.out.print("Введите арифметическое действие (+,-,*,/): ");
                    action = scanner.next();
                    counting(stack, action);

                } else {
                    flag = true;
                }

                if (choice.equals("n")) {
                    continue;
                }
                if (choice.equals("q")) {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    
    }
}
