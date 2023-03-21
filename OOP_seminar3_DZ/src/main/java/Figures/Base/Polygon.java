package Figures.Base;


public abstract class Polygon implements Figure, Perimeterable {
    public int[] sides;

    public Polygon(int[] sides) throws IllegalArgumentException{
        for (int i =0; i < sides.length; i++){
            if (sides[i] <= 0) {throw new IllegalArgumentException("Стороны не могут быть меньше равны нулю");}
        this.sides = sides;
        }
    }

    @Override
    public int PerimeterCalculation() {
        int sum = 0;
        for (int side : sides)
            sum += side;
        return sum;
    }

}
