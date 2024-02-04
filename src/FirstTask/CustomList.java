package FirstTask;

import java.util.Arrays;
import java.util.Iterator;

public class CustomList<T> {
    protected T[] elements;
    protected static int currentIndex;

    public CustomList() {
        this.elements = (T[]) new Object[10];
        currentIndex = 0;
    }

    public CustomList(int size) {
        this.elements = (T[]) new Object[size];
        currentIndex = 0;
    }

    public void add(T element) {
        ensureCapacity();
        this.elements[currentIndex++] = element;
    }

    public void remove(T element) throws Exception {
        T[] temp;
        boolean noSuchElement = true;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                noSuchElement = false;
                int foundIndex = i;
                temp = (T[]) new Object[elements.length - 1];

                for (int j = 0, k = 0; j < elements.length; j++, k++) {
                    if (j == foundIndex) {
                        k--;
                        continue;
                    }
                    temp[k] = elements[j];
                }
                this.elements = temp;
                break;
            }
        }

        if (noSuchElement) {
            throw new Exception("\nThere is no a such element for removal: " + element);
        }
        currentIndex--;
    }

    public boolean isExists(T value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public T getByIndex(int index) throws Exception {
        if (index > this.elements.length || index < 0) {
            throw new Exception("\nInvalid index!");
        }

        if (index <= currentIndex) {
            return elements[index];
        } else {
            throw new Exception("\nNulls are being populated!");
        }
    }

    public void clear() {
        for (int i = 0; i < this.elements.length; i++) {
            elements[i] = null;
        }
        currentIndex = 0;
    }

    private void ensureCapacity() {
        if (currentIndex == this.elements.length - 1) {
            int updatedSize = this.elements.length * 2;
            this.elements = Arrays.copyOf(this.elements, updatedSize);
        }
    }

    public int length() throws Exception {
        if (currentIndex == 0) {
            throw new Exception("\nCollection is empty!");
        }
        return currentIndex;
    }
}
