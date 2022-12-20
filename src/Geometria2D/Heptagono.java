package Geometria2D;

public class Heptagono extends  Formulas {
    private double lado;
    private double apotema;
    public Heptagono(double lado){
        this.lado=lado;
        apotema=0;
        calcArea();
        calcPerimetro();
    }
    @Override
    protected void calcArea(){
        area=(perimetro*apotema)/2;
    }
    protected void calcPerimetro(){
        perimetro=lado*7;
    }

    public double calcApotema(){
        return apotema=Math.sqrt(3*(lado/2))/2;
    }

    public double getApotema() {
        return apotema;
    }
}

