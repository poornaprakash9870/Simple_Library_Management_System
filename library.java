package Library_Managment;

import java.util.ArrayList;
import java.util.Scanner;

public class library {
    private static ArrayList<book> books = new ArrayList<>();
    private static ArrayList<student> students = new ArrayList<>();

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" LIBRARY MANAGEMENT SYSTEM   ");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Books");
            System.out.println("6. View Students");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    addStudent(sc);
                    break;
                case 3:
                    issueBook(sc);
                    break;
                case 4:
                    returnBook(sc);
                    break;
                case 5:
                    viewBooks();
                    break;
                case 6:
                    viewStudents();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 0);
    }

    private static void addBook(Scanner sc){
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        book b = new book(name,author);
        books.add(b);

        System.out.println("Book Added successfully");
        System.out.println("-------------------------");
    }

    private static void addStudent(Scanner sc){
        System.out.print("Enter student ID; ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student Name: ");
        String name = sc.nextLine();

        student s = new student(id,name);
        students.add(s);
    }

    private static book findBookById(int id) {
        for (book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    private static student findStudentById(int id) {
        for (student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    private static void issueBook(Scanner sc){
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        book b = findBookById(bookId);
        student s = findStudentById(studentId);
        if(b!=null && s!=null){
            if (b.isIssued()){
                System.out.println("Book Already Issued");
            }
            else{
                b.issueBook();
                s.borrow(b);
                System.out.println("Book Issued Successfully!");
            }
        }
        else{
            System.out.println("Invalid IDs");
        }
    }

    private static void returnBook(Scanner sc){
        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        book b = findBookById(bookId);
        if (b!=null) {
            if(!b.isIssued()){
                System.out.println("Book Was Not Issued");
            }
            else{
                b.returnBook();
                System.out.println("Book Returned Successfully!");
            }
        }
        else {
            System.out.println("Book Not Found");
        }
    }

    private static void viewBooks() {
        for (book b : books) {
            System.out.println(b);
            System.out.println("-------------------");
        }
    }

    private static void viewStudents() {
        for (student s : students) {
            System.out.println(s);
            System.out.println("-------------------");
        }
    }
}
