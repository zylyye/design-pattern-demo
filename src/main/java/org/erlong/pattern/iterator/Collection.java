package org.erlong.pattern.iterator;

public class Collection {

    private Item[] items = new Item[16];

    private int currentIndex = 0;

    public class CollectionIterator implements Iterator {

        int position = 0;

        @Override
        public Item next() {
            if (!this.hasNext()) {
                throw new IndexOutOfBoundsException();
            }
            return items[position++];
        }

        @Override
        public boolean hasNext() {
            return position < currentIndex;
        }
    }

    public void add(Item item) {
        this.items[currentIndex++] = item;
    }

    public Iterator createIterator() {
        return new CollectionIterator();
    }
}
