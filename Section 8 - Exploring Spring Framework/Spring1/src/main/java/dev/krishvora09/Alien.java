package dev.krishvora09;

public class Alien {

    private int age;
//    private Laptop lap;
    private Computer comp;

    public Alien() {
        System.out.println("Object Created");
    }

//    public Alien(int age) {
//        System.out.println("Parameterized Constructor Called!");
//        this.age = age;
//    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Computer comp) {
//        this.age = age;
//        this.comp = comp;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        System.out.println("Coding");
        comp.compile();
    }

}
