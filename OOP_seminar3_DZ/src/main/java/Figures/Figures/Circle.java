package Figures.Figures;

import Figures.Base.Figure;
import Figures.Base.Lenghtable;

public class Circle implements Figure, Lenghtable {

    private double d;

    public Circle(double d) throws IllegalArgumentException{
        if (d <= 0)
            throw new IllegalArgumentException("Радиус не может быть <= 0");
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Круг";
    }

    @Override
    public double area() {
        return 0.25*Math.PI*d;
    }

    @Override
    public double lenght() {
        return d*Math.PI;
    }

    
}
