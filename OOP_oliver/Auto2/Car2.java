package main.OOP_oliver.Auto2;

public class Car2 {

    String brand;
    String reg_num;
    String colour;
    int max_speed;

    public Car2(String brand, String reg_num, String colour, int max_speed) {
        this.brand = brand;
        this.reg_num = reg_num;
        this.colour = colour;
        this.max_speed = max_speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public String car_data() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", reg_num='" + reg_num + '\'' +
                ", colour='" + colour + '\'' +
                ", max_speed=" + max_speed +
                '}';
    }
}
