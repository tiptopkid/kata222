package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int series;

    private String color;

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
