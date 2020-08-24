/*  Created by IntelliJ IDEA.
 *  User: Lakhan
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}
