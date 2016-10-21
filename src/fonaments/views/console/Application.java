package fonaments.views.console;

import fonaments.models.entitats.Cercle;
import fonaments.models.entitats.Rectangle;
import fonaments.models.entitats.Sphere;
import fonaments.models.entitats.Square;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int calcul = 0;
        do{        
        System.out.println("Quina figura vols(1. Cuadrat, 2. Cercle, 3. Rectangle, 4. Esfera): ");
        calcul = input.nextInt();
        }while(calcul < 1 || calcul > 4);
     switch(calcul){        

       case 1:
           Square();
       break;

       case 2:
           Cercle();
       break;

       case 3:      
           Rectangle();
       break;
       
       case 4:
           Sphere();
       break;

        }
    }
    
//<editor-fold defaultstate="collapsed" desc="Entitats">
    //<editor-fold defaultstate="collapsed" desc="Square">
    public static void Square(){
        Scanner input = new Scanner(System.in);
        double side;
            System.out.println("Digam una mida del costat: ");
            side = input.nextDouble();
            Square c1 = new Square(side);
                System.out.printf("El costat del Cuadrat es: %.2f %n", c1.getSide());
                System.out.printf("L'area del Cuadrat es: %.2f %n", c1.getArea());
                System.out.printf("El perimetre del Cuadrat es: %.2f %n", c1.getPerimeter());
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Cercle">
    public static void Cercle(){
        Scanner input = new Scanner(System.in);
        double diametro;
        double pi = 3.141592;
            System.out.println("Digam una mida del diametre: ");
            diametro = input.nextDouble();
            Cercle c2 = new Cercle(diametro, pi);
            System.out.printf("El diametre del Cercle es: %.2f %n", c2.getDiametro());
            System.out.printf("L'area del Cercle es: %.2f %n", c2.getArea());
            System.out.printf("El perimetre del Cercle es: %.2f %n", c2.getPerimeter());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Rectangle">
    public static void Rectangle(){
        Scanner input = new Scanner(System.in);
        double base;
        double altura = 10;
            /* System.out.println("Digam una mida de l'altura: ");
            altura = input.nextDouble();*/
            System.out.println("Digam una mida de la base: ");
            base = input.nextDouble();
            Rectangle c3 = new Rectangle(base, altura);
            System.out.printf("La base del Rectangle es: %.2f %n", c3.getBase());
            System.out.printf("L'altura del Rectangle es: %.2f %n", c3.getAltura());
            System.out.printf("L'area del Rectangle es: %.2f %n", c3.getArea());
            System.out.printf("El perimetre del Rectangle es: %.2f %n", c3.getPerimeter());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Sphere">
        public static void Sphere(){
            Scanner input = new Scanner(System.in);
            double radi;
            double pi = 3.141592;
            System.out.println("Digam una mida del radi: ");
            radi = input.nextDouble();
            Sphere c4 = new Sphere(radi, pi);
            System.out.printf("El radi de la Esfera es: %.2f %n", c4.getRadi());
            System.out.printf("El volumen de la Esfera es: %.2f %n", c4.getVolumen());
        }
    //</editor-fold>
//</editor-fold>
}
