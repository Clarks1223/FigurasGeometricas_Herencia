package Geometria3D;

public abstract class Formulas3D {
    double area;
    double volumen;
    public double getArea(){return area;}
    public double getVolumen(){return volumen;}

    protected abstract void calcularArea();
    protected abstract void calcularVolumen();
}
