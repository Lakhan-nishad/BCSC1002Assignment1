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
    private String authorNameOfBook;
    private long ISBNNumberOfBook;

    public long getISBNNumberOfBook() {
        return ISBNNumberOfBook;
    }

    public void setISBNNumberOfBook(long ISBNNumberOfBook) {
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public Book(String bookName, String authorNameOfBook, long ISBNNumberOfBook) {
        this.bookName = bookName;
        this.authorNameOfBook = authorNameOfBook;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public String getAuthorNameOfBook() {
        return authorNameOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorNameOfBook(String authorNameOfBook) {
        this.authorNameOfBook = authorNameOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorNameOfBook='" + authorNameOfBook + '\'' +
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
                Objects.equals(getAuthorNameOfBook(), book.getAuthorNameOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorNameOfBook(), getISBNNumberOfBook());
    }
}
