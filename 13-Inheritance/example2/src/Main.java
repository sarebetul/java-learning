public class Main {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();
        TeacherManager teacherManager = new TeacherManager();
        studentManager.Add();
        studentManager.Delete();
        teacherManager.Add();
        teacherManager.Delete();
        teacherManager.GiveExam();
    }
}
