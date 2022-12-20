package Geometria2D;

public class Pentagono extends Formulas{
    private double lado;
    private double apotema;
    public Pentagono(double lado){
        this.lado=lado;
        calcArea();
        calcPerimetro();
    }
    @Override
    protected void calcArea(){
        /*falta multiplicar por el apotema*/
        area=(5*lado*calcApotema())/2;
    }
    protected void calcPerimetro(){
        perimetro=lado*5;
    }

    public double getApotema() {
        return apotema=calcApotema();
    }

    public double calcApotema(){
        return apotema=lado/1.45;
    }

}
