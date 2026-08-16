public class Main {
    public static void main(String[] args){
        BaseAnimal[] baseAnimals = new BaseAnimal[]{new Dog(), new Cat()};
        for(BaseAnimal baseAnimal:baseAnimals){
            baseAnimal.makeSound();
        }
    }
}
