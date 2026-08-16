public class Main {
    public static void main(String[] args){
        BaseEmployee[] baseEmployees = new BaseEmployee[] {new Developer(),new Intern(),new Manager()};
        for(BaseEmployee baseEmployee:baseEmployees){
            System.out.println(baseEmployee.calculateSalary(10000));
        }
    }
}
