package level2;
import java.util.List;

import java.util.ArrayList;

class Animal {
    public void makeSound () {
        System.out.println("Hello");
    }
}
class Dog extends Animal{
    @Override 
    public void makeSound() {
        System.out.println("wof wof");
    }
}

class Cat extends Animal{
    @Override 
    public void makeSound() {
        System.out.println("nyannn");
    }
}

class Cow extends Animal{
    @Override 
    public void makeSound() {
        System.out.println("Maa Maa");
    }
}
public class exe4 {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        // dog.makeSound();
        // cat.makeSound();
        // cow.makeSound();

        List<Animal> name = new ArrayList<>();
        name.add(cow);
        name.add(dog);
        name.add(cat);

        name.get(1).makeSound();

        name.set(1,cat);

        name.get(1).makeSound();

        name.add(cow);

        name.get(3).makeSound();

        name.remove(1);

        name.get(1).makeSound();
        System.out.print("Mg Mg");
    }
}
