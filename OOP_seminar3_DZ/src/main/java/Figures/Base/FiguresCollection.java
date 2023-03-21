package Figures.Base;

import Figures.Figures.Circle;
import Figures.Figures.Rectangle;
import Figures.Figures.Square;
import Figures.Figures.Triangle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FiguresCollection {
    private final ArrayList<Figure> figureArrayList = new ArrayList<Figure>();


    public void info(){
        for (Figure figure: figureArrayList) {
            System.out.println(String.format("%s:", figure));
            System.out.printf("Площадь %.2f", figure.area());
            if (figure instanceof Perimeterable perimeterable) {
                System.out.printf(", периметр %d\n", perimeterable.PerimeterCalculation());
            }
            if (figure instanceof Lenghtable){  // является ли объект Кругом, тогда
                Lenghtable lenghtable = (Lenghtable) figure; // создаем переменную и приводим ее к кругу
                System.out.printf(", длина окружности: %.2f\n", lenghtable.lenght());
            }
        }
    }

    public void addFigure (Figure figure){
        figureArrayList.add(figure);
    }

    public void deleteFigure(Figure figure){
        figureArrayList.remove(figure);
    }

    public void changeFigureByIndex (int index){
        changeFigure(figureArrayList.get(index));
    }


    public void changeFigure (Figure figure){
        if (figure instanceof Lenghtable){
            Circle f1 = (Circle) figure;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите новое значение диаметра: ");
            double newD = Double.parseDouble(scanner.nextLine());
            f1.setD(newD);
        } else if (figure instanceof Perimeterable){
            Polygon f2 = (Polygon) figure;
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < f2.sides.length; i++){
                System.out.printf("Введите новое значение стороны №%d: ", i+1);
                f2.sides[i] = Integer.parseInt(scanner.nextLine());
            }
        }
    }
    public void sortFigure() {
        figureArrayList.sort(Comparator.comparingDouble(Figure::area));
    }
}
