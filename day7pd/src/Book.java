import java.sql.SQLOutput;

public class Book {
    public String author;
    public String title;
    public int year;
    public int thisyear;

    public Book(String author, String title, int year, int thisyear){
        this.author = author;
        this.title = title;
        this.year = year;
        this.thisyear = thisyear;


    }
    public void dati(){
        System.out.println(author);
        System.out.println(title);
        System.out.println(year);

    }
    public int calcage(){
        int age = this.thisyear - this.year;
        return age;
    }


}
