import java.text.DecimalFormat;
import java.util.Scanner;
import Geometria2D.*;
import Geometria3D.*;
public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        DecimalFormat dcf=new DecimalFormat("#.00");
        int menu=1, submenu=1, op1=1;
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
                                System.out.print("Ingrese el radio: ");
                                var1 = sc.nextDouble();
                                Circulo cir = new Circulo(var1);
                                System.out.println("El area es: " + dcf.format(cir.getArea()));
                                System.out.println("El perimetro es: " + dcf.format(cir.getPerimetro()));
                                System.out.println("El diametro es: " + dcf.format(cir.getDiametro()));
                                break;
                            case 2:
                                System.out.println("***Cuadrado***");
                                var1=guarDato();
                                Cuadrado cuad=new Cuadrado(var1);
                                cuad.calcDiagonal();
                                System.out.println("La diagonal es: " + dcf.format(cuad.getDiagonal()));
                                System.out.println("El area es: " + dcf.format(cuad.getArea()));
                                System.out.println("El perimetro es: " + dcf.format(cuad.getPerimetro()));
                                break;
                            case 3:
                                System.out.println("***PENTAGONO***");
                                var1=guarDato();
                                Pentagono pent= new Pentagono(var1);
                                pent.calcApotema();
                                System.out.println("El apotema es: " + dcf.format(pent.getApotema()));
                                System.out.println("El area es: " + dcf.format(pent.getArea()));
                                System.out.println("El perimetro es: " + dcf.format(pent.getPerimetro()));
                                break;
                            case 4:
                                System.out.println("***HEXAGONO***");
                                var1=guarDato();
                                Hexagono hex=new Hexagono(var1);
                                hex.calcApotema();
                                System.out.println("El apotema es: " + dcf.format(hex.getApotema()));
                                System.out.println("El area es: " + dcf.format(hex.getArea()));
                                System.out.println("El perimetro es: " + dcf.format(hex.getPerimetro()));
                                break;
                            case 5:
                                System.out.println("***Heptagono***");
                                var1=guarDato();
                                Heptagono hep= new Heptagono(var1);
                                hep.calcApotema();
                                System.out.println("El apotema es: " + dcf.format(hep.getApotema()));
                                System.out.println("El area es: " + dcf.format(hep.getApotema()));
                                System.out.println("El perimetro es: " + dcf.format(hep.getPerimetro()));
                                break;
                        }
                    }
                    break;
                case 2:
                    while(op1!=0) {
                        op1 = Menu3D();
                        switch (op1) {
                            case 1:
                                System.out.println("***CILINDRO***");
                                System.out.print("Ingrese el radio: ");
                                var1 = sc.nextDouble();
                                System.out.print("Ingrese la altura: ");
                                var2 = sc.nextDouble();
                                Cilindro cil = new Cilindro(var1,var2);
                                System.out.println("Area de cilindro -> "+dcf.format(cil.getArea()));
                                System.out.println("Volumen de cilindro -> "+dcf.format(cil.getVolumen()));
                                break;
                            case 2:
                                System.out.println("***CONO***");
                                System.out.print("Ingrese el radio: ");
                                var1 = sc.nextDouble();
                                System.out.print("Ingrese la generatriz: ");
                                var2 = sc.nextDouble();
                                System.out.print("Ingrese la altura: ");
                                var3 = sc.nextDouble();
                                Cono cn = new Cono(var1,var2,var3);
                                System.out.println("Area de cono -> "+dcf.format(cn.getArea()));
                                System.out.println("Volumen de cono -> "+dcf.format(cn.getVolumen()));
                                break;
                            case 3:
                                System.out.println("***CUBO***");
                                var1=guarDato();
                                Cubo cb = new Cubo(var1);
                                System.out.println("Area de cubo -> "+dcf.format(cb.getArea()));
                                System.out.println("Volumen de cubo -> "+dcf.format(cb.getVolumen()));
                                break;
                            case 4:
                                System.out.println("***ESFERA***");
                                System.out.print("Ingrese el radio: ");
                                var1 = sc.nextDouble();
                                Esfera esf = new Esfera(var1);
                                System.out.println("Area de esfera -> "+dcf.format(esf.getArea()));
                                System.out.println("Volumen de esfera -> "+dcf.format(esf.getVolumen()));
                                break;
                            case 5:
                                System.out.println("***PIRAMIDE***");
                                System.out.print("Ingrese la base: ");
                                var1 = sc.nextDouble();
                                System.out.print("Ingrese la altura: ");
                                var2 = sc.nextDouble();
                                Piramide pir = new Piramide(var1,var2);
                                System.out.println("Area de piramide -> "+dcf.format(pir.getArea()));
                                System.out.println("Volumen de piramide -> "+dcf.format(pir.getVolumen()));
                                break;
                        }
                    }
                    break;
            }
        }
        menu = 1;
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
        System.out.println("2. Cuadrado");
        System.out.println("3. Pentagono");
        System.out.println("4. Hexagono");
        System.out.println("5. Heptagono");
        System.out.println("0. Regresar al menu Principal");
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
    static int Menu3D(){
        int op;
        System.out.println("MENU FIGURAS 3D");
        System.out.println("1. Cilindro");
        System.out.println("2. Cono");
        System.out.println("3. Cubo");
        System.out.println("4. Esfera");
        System.out.println("5. Piramide");
        System.out.println("0. Regresar al menu Principal");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        return op;
    }
}