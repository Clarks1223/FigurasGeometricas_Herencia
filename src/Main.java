import java.text.DecimalFormat;
import java.util.Scanner;
import Geometria2D.*;
public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        DecimalFormat dcf=new DecimalFormat("#.00");
        int menu=1, submenu=1;
        double var1, var2, var3;
        while (menu!=0){
            menu=MenuPrincipal();
            switch (menu){
                case 1:
                    while (submenu!=0) {
                        submenu=Menu2D();
                        switch (submenu) {
                            case 1:
                            System.out.println("***CIRCULO***");
                            var1 = guarDato();
                            Circulo cir = new Circulo(var1);
                            System.out.println("El area es: " + dcf.format(cir.getArea()));
                            System.out.println("El perimetro es: " + dcf.format(cir.getPerimetro()));
                            System.out.println("El diametro es: " + dcf.format(cir.getDiametro()));
                            break;
                        }
                    }
                    break;
                case 2:
                    break;
            }
        }
    }
    static int MenuPrincipal(){
        int op;
        System.out.println("****MENU PRINCIPAL***");
        System.out.println("1. Figuras 2D");
        System.out.println("2. Figuras 3D");
        System.out.println("0. Salir");
        System.out.print("opcion: ");
        op=sc.nextInt();
        return op;
    }
    static int Menu2D(){
        int op;
        System.out.println("MENU FIGURAS 2D");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Cuadrado");
        System.out.println("0. Salir");
        System.out.print("opcion: ");
        op=sc.nextInt();
        return op;
    }
    static double guarDato(){
        double var;
        System.out.print("Ingrese el lado: ");
        var=sc.nextDouble();
        return var;
    }
}