package FirstTask;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AuxList<T> extends CustomList<T> implements Iterable<T> {

    public AuxList() {
        super();
    }

    public AuxList(int size) {
        super(size);
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorForAuxList();
    }

    public class IteratorForAuxList implements Iterator<T> {
        private int current = 0;
        @Override
        public boolean hasNext() {
            return current < currentIndex;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return elements[current++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
