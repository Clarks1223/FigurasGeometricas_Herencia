package Geometria2D;

public class Circulo extends Formulas{
    private double radio;
    private double diametro;
    public Circulo(double radio){
        this.radio=radio;
        this.diametro=diametro;
        calcArea();
        calcPerimetro();
    }
    @Override
    protected void calcArea(){
        area=Math.PI*Math.pow(radio,2);
    }
    protected void calcPerimetro(){
        perimetro=2*Math.PI*radio;
    }

    public double getDiametro() {
        return diametro=2*radio;
    }
}
