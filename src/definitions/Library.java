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

    public Book[] getStore() {
        return store;
    }

    public void setStore(Book[] store) {
        this.store = store;
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
