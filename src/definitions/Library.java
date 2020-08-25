/*  Created by IntelliJ IDEA.
 *  User: Lakhan
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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
}
