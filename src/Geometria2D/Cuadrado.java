package Geometria2D;

public class Cuadrado extends Formulas{
    private double lado;
    private double diagonal;
    public Cuadrado(double lado){
        this.lado=lado;
        this.diagonal=0;
        calcArea();
        calcPerimetro();
    }
    @Override
    protected void calcArea(){
        area=Math.pow(lado,2);
    }
    protected void calcPerimetro() {
        perimetro=4*lado;
    }
    public void calcDiagonal(){
        diagonal=lado*Math.sqrt(2);
    }

    public double getDiagonal() {
        return diagonal;
    }
}
