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

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
    }
}
