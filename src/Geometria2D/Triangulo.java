package Geometria2D;

public class Triangulo extends Formulas{
    double base, altura, lado1,lado2,lado3,cat1, cat2, hipotenusa;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3, double cat1, double cat2, double hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.hipotenusa=hipotenusa;
        calcArea();
        calcPerimetro();
    }

    protected void calcArea(){
        area=(base*altura)/2;
    }
    protected void calcPerimetro(){
        perimetro=lado1+lado2+lado3;
    }

    public void calcHipotenusa(){
        hipotenusa=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
    }
}
