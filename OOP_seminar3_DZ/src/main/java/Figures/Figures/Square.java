package Figures.Figures;

public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        super(side, side);
    }

    public Square(){
        this(2);
    }

    @Override
    public String toString() {
        return "Квадрат";
    }

    public void setSide(int side) {
        this.side = side;
    }
}
