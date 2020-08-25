/*  Created by IntelliJ IDEA.
 *  User: Lakhan
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private long universityRollNumber;
    private int numberOfBookIssued;
    private Book[] nameOfBooks;

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

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
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
