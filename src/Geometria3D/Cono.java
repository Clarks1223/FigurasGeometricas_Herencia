package Geometria3D;

public class Cono extends Formulas3D{
    private double radio;
    private double generatriz;
    private double altura;
    public Cono (double radio, double generatriz, double altura) {
        this.radio = radio;
        this.generatriz = generatriz;
        this.altura = altura;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=((Math.PI*radio*generatriz)+(Math.PI*Math.pow(radio,2)));}
    @Override
    public void calcularVolumen(){volumen=(Math.PI*altura*Math.pow(Math.PI,2))/3;}
}
