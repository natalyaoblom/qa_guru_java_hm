package guru.qa;

public class Dog {
    String name;
    int age;
    String favoriteFood;

    public Dog(String name, int age, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String toString() {
        return "My name is " + this.name + ", " +
                "I am " + this.age + " years old, " +
                "my favorite food is " + this.favoriteFood + ". " +
                "Woooof!";
    }
}
