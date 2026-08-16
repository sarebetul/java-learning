public class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.setAge(20);
        person.setFirstName("Sare Betül");
        person.setLastName("Yazar");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());
    }
}
