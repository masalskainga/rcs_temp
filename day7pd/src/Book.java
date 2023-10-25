public class Book {
    public String author;
    public String title;
    public int year;
    public Book(String author, String title, int year){
        this.author = author;
        this.title = title;
        this.year = year;


    }
    public void dati(){
        System.out.println(author);
        System.out.println(title);
        System.out.println(year);

        int result = 2023 - year;
       return result;

    }


}
