

class Animal {
    String name;

    public Animal() {

    }

    public void eat() {
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal {
    public Dog() {
        super();
    }

    public void bark() {
        System.out.print("Dog is barking");
    }
}

public class Animalexam {
    public static void main(String[] args) {
        Dog Bok = new Dog();
        Bok.eat();
        Bok.bark();
    }
}
