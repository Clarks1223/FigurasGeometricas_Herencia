package Geometria3D;
public class Cilindro extends Formulas3D{
    private double radio;
    private double altura;
    public Cilindro (double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        calcularArea();
        calcularVolumen();
    }
    @Override
    public void calcularArea(){area=(2* Math.PI*radio)*(altura*radio);}
    @Override
    public void calcularVolumen(){volumen=(Math.PI*Math.pow(radio,2))*altura;}
}
