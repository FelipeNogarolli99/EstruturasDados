public class Fila<T> {
    private int top = -1; //  ultimo elemento fila
    private int base = 0; // primeiro elemento fila
    private T[] data; // array para armazenar os elementos
    private int size;


    public Fila(int size) {
        this.size = size; // define tamanho maximo da fila
        data = (T[]) new Object[size];// inicializa o array com os elementos
    }

    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia");
        }
        top = move(top + 1); // atauliza o topo
        data[top] = item; // joga pro topo
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        T removedItem = data[base]; // armazena o elemente removido
        data[base] = null; // remove do array
        base = move(base + 1); // atualixza a base
        return removedItem;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null; // todos elementos como nulo
        }
        top = -1;
        base = 0;
    }

    public boolean isFull() {
        return move(top + 1) == base || (top == size - 1 && base == 0);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private int move(int position) {
        return (position + size) % size; // movimento circular
    }

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>(5);

        fila.clear();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.remove());
        System.out.println(fila.remove());

        fila.add(4);

        System.out.println(fila.remove());

        fila.clear();
        System.out.println("Stack is empty: " + fila.isEmpty());
    }
}

