package org.erlong.pattern.iterator;

public class Client {

    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.add(new Item(1));
        collection.add(new Item(2));
        collection.add(new Item(3));
        collection.add(new Item(4));

        Iterator iterator = collection.createIterator();
        // 利用迭代器遍历
        while (iterator.hasNext()) {
            Item next = iterator.next();
            System.out.println(next.getNo());
        }
    }
}
