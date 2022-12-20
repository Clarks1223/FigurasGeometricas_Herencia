package Geometria2D;

public abstract class Formulas {
    double area;
    double perimetro;
    public double getArea(){return area;}
    public double getPerimetro(){return perimetro;}

    protected abstract void calcArea();
    protected abstract void calcPerimetro();
}