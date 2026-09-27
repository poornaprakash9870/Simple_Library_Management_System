package Library_Managment;

public class book {
    private static int idCounter = 0;
    private int id;
    private String bookName;
    private String authorName;
    private boolean issued;

    public book(String bookName,String authorName){
        this.id = ++idCounter;
        this.bookName = bookName;
        this.authorName = authorName;
        this.issued = false;
    }

    public int getId(){
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issueBook() {
        issued = true;
    }

    public void returnBook() {
        issued = false;
    }

    public String toString() {
        return "Book ID: " + id +
                "\nBook Name: " + bookName +
                "\nAuthor: " + authorName +
                "\nIssued: " + issued;
    }
}
