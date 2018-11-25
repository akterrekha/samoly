
public class Animal {

    String name;
    String color;
    double age;
    String race;

    public Animal() {
    }

    public Animal(String name, String color, double age, String race) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }

    void bite() {
        System.out.println("Animal can bite.");
    }

    void eat() {
        System.out.println("Animal can eat.");
    }

    void run() {
        System.out.println("Animal can run.");
    }

    void walk() {
        System.out.println("Animal can walk.");
    }

    void sleep() {
        System.out.println("Animal can sleep.");
    }

    void bark() {
        System.out.println("Animal can bark.");
    }

    public static void main(String[] args) {
        Animal animal200 = new Animal("mr. nova", "Gray", 25.36, "Asian");
        System.out.println(animal200);

    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }
}
