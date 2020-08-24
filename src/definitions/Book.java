/*  Created by IntelliJ IDEA.
 *  User: Lakhan
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authourNameOfBook;
    private long ISBNNumberOfBook;

    public long getISBNNumberOfBook() {
        return ISBNNumberOfBook;
    }

    public void setISBNNumberOfBook(long ISBNNumberOfBook) {
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public String getAuthourNameOfBook() {
        return authourNameOfBook;
    }

    public void setAuthourNameOfBook(String authourNameOfBook) {
        this.authourNameOfBook = authourNameOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookName, String authourNameOfBook, long ISBNNumberOfBook) {
        this.bookName = bookName;
        this.authourNameOfBook = authourNameOfBook;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authourNameOfBook='" + authourNameOfBook + '\'' +
                ", ISBNNumberOfBook=" + ISBNNumberOfBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getISBNNumberOfBook() == book.getISBNNumberOfBook() &&
                Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthourNameOfBook(), book.getAuthourNameOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthourNameOfBook(), getISBNNumberOfBook());
    }
}
