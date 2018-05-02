public class Person {
    public String name;

    public Person(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello! My name is " + this.name);
    }

    public static void main(String[] args) {
        Person MollyMauk = new Person("MollyMauk Tea-Leaf");
        MollyMauk.sayHello();
    }
}
