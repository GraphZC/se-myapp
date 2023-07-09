import myapp.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mew", 2, "white");
        cat.sayHello();
        cat.setName("Mewtwo");
        cat.setAge(-1);
        cat.setColor("black");
        cat.sayHello();
    }
}