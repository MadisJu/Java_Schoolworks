package main.OOP_oliver;

public class Koer {

    String color;
    private int weigh;
    private int age;

    public Koer(String color, int weigh, int age) {
        this.color = color;
        this.weigh = weigh;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Koer{" +
                "color='" + color + '\'' +
                ", weigh=" + weigh +
                ", age=" + age +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
