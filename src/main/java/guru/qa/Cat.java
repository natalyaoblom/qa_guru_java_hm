package guru.qa;

public class Cat {
    String name;
    int age;
    String favoriteFood;

    public Cat() {

    }

    public Cat(String name, int age, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteFood =favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String toString() {
        return "My name is " + this.name + ", " +
                "I am " + this.age + " years old, " +
                "my favorite food is " + this.favoriteFood + ". " +
                "Meooow!";
    }
}
