public class Main {
    public static void main(String[] args){
        Employee employee = new Employee(1,"Sare",55000);
        System.out.println("id: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
