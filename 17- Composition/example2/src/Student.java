public class Student {
    String name;
    static int studentCount = 0;
    public Student(String name){
        this.name = name;
        studentCount++;
    }
}