import java.sql.SQLOutput;

public class Student {
    public String name;
    public String lastname;
    public String faculty;
    public int course;
    public Student(String name, String lastname, String faculty, int course){
        this.name = name;
        this.lastname = lastname;
        this.course = course;
        this.faculty = faculty;

        if (this.course < 1){
            System.out.println("1");
        }else if(this.course > 4){
            System.out.println("Kļūda");

        }

    }

    public void stdati(){
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(course);
        System.out.println(faculty);

    }
}
