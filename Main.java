import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        Stack stack = new Stack();
        Queue queue = new Queue();

        // passo 1
        list.add(new Integer[] {1, 2, 3, 4, 5});

        // passo 2
        for (int i = 0; i < 5; i++) {
            stack.add(list.pop(0));
        }

        // passo 3
        for (int i = 0; i < 5; i++) {
            queue.add(stack.pop());
        }

        // passo 4
        list.add(new Integer[] {6, 7, 8, 9, 10});

        // passo 2 v2
        for (int i = 0; i < 5; i++) {
            stack.add(list.pop(0));
        }
        // passo 3 v2
        for (int i = 0; i < 5; i++) {
            queue.add(stack.pop());
        }

        // mostra a lista
        for (int i = 0; i < 10; i++) {
            System.out.print(queue.pop() + " ");
        }
    }
}