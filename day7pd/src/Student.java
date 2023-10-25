import java.sql.SQLOutput;

public class Student {
    public String name;
    public String lastname;
    public int course;
    public String faculty;
    public Book(String author, String title, int year){
        this.name = name;
        this.lastname = lastname;
        this.course = course;
        this.faculty = faculty;

    public void info(){
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(course);
        System.out.println(faculty);
    }
}
