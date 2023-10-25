public class Student {
    public String name;
    public String lastname;
    public int course;
    public String faculty;
    public Student(String name, String lastname, int course, String faculty){
        this.name = name;
        this.lastname = lastname;
        this.course = course;
        this.faculty = faculty;

    }

    public void stdati(){
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(course);
        System.out.println(faculty);
    }
}
