package Figures.Figures;

import Figures.Base.*;

public class Rectangle extends Polygon {

    public Rectangle(int a, int b) throws IllegalArgumentException{
        super(new int[]{a,b,a,b});
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("Стороны не могут быть <= 0");

    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return "Прямоугольник";
    }


}
