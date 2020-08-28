/*  Created by IntelliJ IDEA.
 *  User: Lakhan
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    public Book[] store;

    public Library(Book[] store) {
        this.store = store;
    }

    public Library() {
        this.store = new Book[10];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Book("Book" + (i + 1), null, 8563259874121L + (i + 1));
        }
    }

    public Book[] getStore() {
        return store;
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

    /**
     * This method shows a list of all the book in our inventory.
     */

    public void listInventory() {
        for (Book book : store) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "store=" + Arrays.toString(store) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getStore(), library.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }
}
