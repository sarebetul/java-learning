public class Student {
    private int grade;

    public void setGrade(int grade){
        if(grade >= 0 && grade <= 100){
            this.grade = grade;
        }
        if(grade < 0 || grade > 100){
            return;
        }
        this.grade = grade;
    }
}

