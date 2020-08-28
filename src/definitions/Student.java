/*  Created by IntelliJ IDEA.
 *  User: Lakhan
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    Library library = new Library();
    private String studentName;
    private long universityRollNumber;
    Scanner scanner = new Scanner(System.in);
    private Book[] nameOfBooks;
    private int numberOfBookIssued = 0;

    public Student(String studentName, long universityRollNumber, int numberOfBookIssued, Book[] nameOfBooks) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBookIssued = numberOfBookIssued;
        this.nameOfBooks = nameOfBooks;
    }

    public Book[] getNameOfBooks() {
        return nameOfBooks;
    }

    public void setNameOfBooks(Book[] nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    public Student() {
        this.nameOfBooks = new Book[5];
    }

    /**
     * This method helps us to issue the book.
     */

    public void doIssue() {
        System.out.print("enter book name: ");
        String bookName = scanner.nextLine();
        System.out.print("enter the author name of the book: ");
        String authorName = scanner.nextLine();
        System.out.print("enter the ISBN number of book which write on the book: ");
        long ISBNNumber = scanner.nextInt();
        scanner.nextLine();
        nameOfBooks[getNumberOfBookIssued()] = new Book(bookName, authorName, ISBNNumber);
        System.out.println(bookName + " " + "book issued!");
        System.out.println("---Press ENTER button for go to FrontDesk.--- ");
        scanner.nextLine();
    }

    /**
     * this method helps us to return the book.
     */

    public void doReturn() {
        numberOfBookIssued = 0;
        this.nameOfBooks = new Book[5];
        System.out.println("Book returned successfully!");
        System.out.println("---Press ENTER button for go to FrontDesk.--- ");
        scanner.nextLine();
    }

    /**
     * This method shows a list of all the book in our inventory.
     */
    public void listInventory() {
        for (Book book : library.store) {
            System.out.println(book);
        }
    }

    /**
     * This method show a list of all the issued book.
     */

    public void showIssuesBook() {
        for (int i = 0; i < numberOfBookIssued; i++) {
            System.out.println(nameOfBooks[i]);
        }
        if (numberOfBookIssued == 0) {
            System.out.println("no any book issued!");
        }
        System.out.println("---Press ENTER button for go to FrontDesk.--- ");
        scanner.nextLine();
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued() {
        this.numberOfBookIssued += 1;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBookIssued=" + numberOfBookIssued +
                ", nameOfBooks=" + Arrays.toString(nameOfBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBookIssued() == student.getNumberOfBookIssued() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getNameOfBooks(), student.getNameOfBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getUniversityRollNumber(), getNumberOfBookIssued());
        result = 31 * result + Arrays.hashCode(getNameOfBooks());
        return result;
    }
}
