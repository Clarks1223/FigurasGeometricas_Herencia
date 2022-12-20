package Geometria3D;
public class Piramide extends Formulas3D{
    private double base;
    private double altura;
    public Piramide (double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=(base*altura)/2;}
    @Override
    public void calcularVolumen(){volumen=(Math.pow(base,2)*altura)/3;}
}
