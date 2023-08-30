public class StaticStack<T> {
    private int top = -1;
    private Object[] data;

    public StaticStack(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("tamanho tem que ser maior que 0");
        }
        data = new Object[size];
    }

    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("pilha está full");
        }
        data[++top] = item;
    }


    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("pilha está empty");
        }
        T item = (T) data[top];
        data[top--] = null;
        return item;
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            data[i] = null;
        }
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

//    public static void main(String[] args) {
//        StaticStack<Integer> stack = new StaticStack<>(5);
//
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//
//        System.out.println("Removed: " + stack.remove()); // Output: 3
//        System.out.println("Removed: " + stack.remove()); // Output: 2
//
//        stack.add(4);
//        stack.add(5);
//
//        while (!stack.isEmpty()) {
//            System.out.println("Removed: " + stack.remove());
//        }
//
//        stack.clear();
//        System.out.println("Stack is empty: " + stack.isEmpty()); // Output: true
//    }
}