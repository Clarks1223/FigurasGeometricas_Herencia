package Geometria3D;
public class Esfera extends Formulas3D{
    private double radio;
    public Esfera (double radio) {
        this.radio = radio;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=4*Math.PI*Math.pow(radio,2);}
    @Override
    public void calcularVolumen(){volumen=(1.3333333)*Math.PI*Math.pow(radio,3);}
}
