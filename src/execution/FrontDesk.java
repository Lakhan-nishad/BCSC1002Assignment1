/*  Created by IntelliJ IDEA.
 *  User: Lakhan
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ALL_ISSUES_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        Student student = new Student();
        do {
            System.out.println("-=-=--=-=-" + "Welcome To The Front Desk" + "-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.print("Enter Your Choice (1 to 4): ");
            clientInput = scanner.nextInt();
            switch (clientInput) {
                case ISSUE_BOOK:
                    System.out.printf("You can take %d book only on rent.\n", (5 - student.getNumberOfBookIssued()));
                    student.doIssue();
                    student.setNumberOfBookIssued();
                    break;
                case SHOW_ALL_ISSUES_BOOK:
                    for (int i = 0; i < student.getNumberOfBookIssued(); i++) {
                        System.out.println(student.getNameOfBooks()[i]);
                    }
                    if (student.getNumberOfBookIssued() == 0) {
                        System.out.println("no any book issued!");
                    }
                    System.out.println("Press ENTER button for go to FrontDesk. ");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case RETURN_BOOK:
                    student.doReturn();
                    break;
                case EXIT:
                    System.out.println("EXIT!");
                    break;
                default:
                    System.out.println("WRONG CHOICE.");
                    System.out.println("PLEASE ENTER RIGHT CHOICE.");
            }
        }
        while (clientInput != EXIT);
        scanner.close();
    }
}
