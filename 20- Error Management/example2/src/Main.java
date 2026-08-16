public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        try {
            manager.addStudent("Sare");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.addStudent("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}