package Geometria2D;

public class Hexagono extends Formulas{
    private double lado;
    private double apotema;
    public Hexagono(double lado){
        this.lado=lado;
        apotema=0;
        calcArea();
        calcPerimetro();
    }
    @Override
    protected void calcArea(){
        area=perimetro*apotema/2;
    }
    protected void calcPerimetro(){
        perimetro=lado*6;
    }
    public void calcApotema(){
        apotema=Math.sqrt(3*(lado/2))/2;
    }

    public double getApotema() {
        return apotema;
    }
}
