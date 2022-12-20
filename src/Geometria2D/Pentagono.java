package Geometria2D;

public class Pentagono extends Formulas{
    private double lado;
    private double apotema;
    Pentagono(double lado, double apotema){
        this.lado=lado;
        this.apotema=apotema;
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
    public double calcApotema(){
        return apotema=lado/1.45;
    }

}
