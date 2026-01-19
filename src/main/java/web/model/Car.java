package web.model;

public class Car {

    private String model;
    private String color;
    private double engine;



    public Car(String model, String color, double engine ) {
        this.model = model;
        this.color = color;
        this.engine = engine;

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getEngine() {
        return engine;
    }
}
