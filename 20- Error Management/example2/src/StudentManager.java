public class StudentManager {
    public void addStudent(String name) throws Exception {

        if (name.trim().isEmpty()) {
            throw new Exception("Student name cannot be empty.");
        }

        System.out.println("Student added.");
    }
}