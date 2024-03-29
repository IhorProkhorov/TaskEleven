package com.hillel.IhorProkhorov.HomeTaskEleven;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TaskTwo<T> implements Iterator<T> {

        private T[] array;
        private int index = 0;

        public TaskTwo(T[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public T next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return array[index++];
        }
}

