import java.sql.SQLOutput;

public class Book {
    public String author;
    public String title;
    public String year;
    public Book(String author, String title, String year){
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public void dati(){
        System.out.println(author);
        System.out.println(title);
        System.out.println(year);

    }


}
