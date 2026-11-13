package OOP;
public class Person{
    private String name;
    private int age;

    public Person(String name_p, int age_p) {
        this.name=name_p;
        this.age=age_p;
    }
    public String Gname() {
        return this.name;
    }
    public int Gage() {
        return this.age;
    }
    public void Increse_age() {
        this.age++;
    }
    public void Sound() {
        System.out.println(this.name+"make a sound");
    }

}


/*

Person class ko lote
String name
int age

constructor ta ku shi mal(parramitr na ku nat)
parameter ko class htae htae

Getname function nat getAge function lote
return pya

*/