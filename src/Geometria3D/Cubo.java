package Geometria3D;

public class Cubo extends Formulas3D{
    private double lado;
    public Cubo (double lado) {
        this.lado = lado;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area = (6*Math.pow(lado,2));}
    @Override
    public void calcularVolumen(){volumen = (Math.pow(lado,3));}
}
