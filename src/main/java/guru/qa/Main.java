package guru.qa;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Forest", 7, "meat");
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setAge(3);
        cat.setFavoriteFood("fish");
        System.out.println(cat);

        Cat cat2 = new Cat("Tom", 5, "sausage");
        System.out.println(cat2);
    }
}
