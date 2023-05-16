import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {
    private List<T> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }
}