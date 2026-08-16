public class Main {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();
        System.out.println(studentManager.addStudent("Sare"));
        System.out.println(studentManager.deleteStudent("Ahmet"));
        System.out.println(studentManager.updateStudent("Mehmet"));
    }
}
