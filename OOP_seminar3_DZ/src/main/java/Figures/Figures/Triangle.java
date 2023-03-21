package Figures.Figures;

import Figures.Base.Perimeterable;
import Figures.Base.Polygon;

public class Triangle extends Polygon {

    public Triangle(int a, int b, int c) throws IllegalArgumentException{
        super(new int[]{a,b,c});
        if ((a + b) <= c || (a+c) <= b || (b+c) <= a)
            throw new IllegalArgumentException("Нельзя создать треугольник с такими сторонами");

    }

    @Override
    public double area() {
        double p = PerimeterCalculation()/2.0;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    @Override
    public String toString() {
        return "Треугольник";
    }


}
