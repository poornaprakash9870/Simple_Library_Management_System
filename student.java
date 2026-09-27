package Library_Managment;

import java.util.ArrayList;

public class student {
    private int id;
    private String name;
    private ArrayList<book> borrowedBooks = new ArrayList<>();

    student(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }

    public void borrow(book b){
        borrowedBooks.add(b);
    }

    public String toString() {
        return "Student ID: " + id +
                "\nStudent Name: " + name +
                "\nBorrowed Books: " + borrowedBooks.size();
    }
}
