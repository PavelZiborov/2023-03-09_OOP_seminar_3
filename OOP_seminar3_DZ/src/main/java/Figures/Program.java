package Figures;

import Figures.Base.*;
import Figures.Figures.*;

public class Program {
    public static void main(String[] args) {

        FiguresCollection figuresCollection = new FiguresCollection();
        Figure triangle = new Triangle(5,3,3);
        Figure square = new Square(6);
        Figure circle = new Circle(100);
        Figure rectangle = new Rectangle(1,20);


        figuresCollection.addFigure(triangle);
        figuresCollection.addFigure(square);
        figuresCollection.addFigure(circle);
        figuresCollection.addFigure(rectangle);


//        figuresCollection.info();
//        figuresCollection.changeFigure(triangle);
//        figuresCollection.info();
//
//        figuresCollection.changeFigureByIndex(2);
//        figuresCollection.info();
//
//        figuresCollection.deleteFigure(square);
//        figuresCollection.info();

        figuresCollection.sortFigure();
        figuresCollection.info();













    }
}


