import java.util.Scanner;

class Stack {
    private char[] data;
    private int top;
    public Stack(int size) {
        data = new char[size];
        top = -1;
    }
    public void push(char value) {
        if (top == data.length - 1) {
            System.out.println("Стек переполнен!");
            return;
        }
        data[++top] = value;
    }
    public char pop() {
        if (top == -1) {
            System.out.println("Стек пуст!");
            return '\0';
        }
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность символов:");
        String input = scanner.nextLine();

        Stack stack = new Stack(input.length());

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        System.out.println("Последовательность в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        scanner.close();
    }
}