package people;

public class Visitor {

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }
}
