package fonaments.views.console;

import fonaments.models.entitats.Cercle;
import fonaments.models.entitats.Rectangle;
import fonaments.models.entitats.Sphere;
import fonaments.models.entitats.Square;
import fonaments.models.entitats.Color;
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
        Color backgroundColor = new Color(255, 255, 255);
        Color foregroundColor = new Color(0, 0, 0);
        
            System.out.printf("%nDigam una mida del costat: ");
            side = input.nextDouble();
            //Square con colores
            Square c1 = new Square(backgroundColor, foregroundColor, side);
                System.out.printf("%nLado: %.2f %n", c1.getSide());
                System.out.printf("L'area del Cuadrat es: %.2f %n", c1.getArea());
                System.out.printf("El perimetre del Cuadrat es: %.2f %n%n", c1.getPerimeter());
                System.out.printf("Background: %s %n", c1.getBackgroundColor().toHexString());
                System.out.printf("Foreground: %s %n%n", c1.getForegroundColor().toHexString());

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Cercle">
    public static void Cercle(){
        Scanner input = new Scanner(System.in);
        double diametro;
        double pi = Math.PI;
        Color backgroundColor = new Color(255, 255, 255);
        Color foregroundColor = new Color(0, 0, 0);
            System.out.println("%nDigam una mida del diametre: ");
            diametro = input.nextDouble();
            Cercle cir1 = new Cercle(backgroundColor, foregroundColor, diametro, pi);
                System.out.printf("%nEl diametre del Cercle es: %.2f %n", cir1.getDiametro());
                System.out.printf("L'area del Cercle es: %.2f %n", cir1.getArea());
                System.out.printf("El perimetre del Cercle es: %.2f %n%n", cir1.getPerimeter());
                System.out.printf("Background: %s %n", cir1.getBackgroundColor().toHexString());
                System.out.printf("Foreground: %s %n%n", cir1.getForegroundColor().toHexString());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Rectangle">
    public static void Rectangle(){
        Scanner input = new Scanner(System.in);
        double base;
        double altura;
        Color backgroundColor = new Color(255, 255, 255);
        Color foregroundColor = new Color(0, 0, 0);
            System.out.println("%nDigam una mida de l'altura: ");
            altura = input.nextDouble();
            System.out.println("%nDigam una mida de la base: ");
            base = input.nextDouble();
            Rectangle rec1 = new Rectangle(base, altura);
                System.out.printf("%nLa base del Rectangle es: %.2f %n", rec1.getBase());
                System.out.printf("L'altura del Rectangle es: %.2f %n", rec1.getAltura());
                System.out.printf("L'area del Rectangle es: %.2f %n", rec1.getArea());
                System.out.printf("El perimetre del Rectangle es: %.2f %n%n", rec1.getPerimeter());
                System.out.printf("Background: %s %n", rec1.getBackgroundColor().toHexString());
                System.out.printf("Foreground: %s %n%n", rec1.getForegroundColor().toHexString());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Sphere">
        public static void Sphere(){
            Scanner input = new Scanner(System.in);
            double radi;
            double pi = Math.PI;
            Color backgroundColor = new Color(255, 255, 255);
            Color foregroundColor = new Color(0, 0, 0);
            
            System.out.println("%nDigam una mida del radi: ");
            radi = input.nextDouble();
            Sphere s1 = new Sphere(radi, pi);
                System.out.printf("El radi de la Esfera es: %.2f %n", s1.getRadi());
                System.out.printf("El volumen de la Esfera es: %.2f %n%n", s1.getVolumen());
                System.out.printf("Background: %s %n", s1.getBackgroundColor().toHexString());
                System.out.printf("Foreground: %s %n%n", s1.getForegroundColor().toHexString());

        }
    //</editor-fold>
//</editor-fold>
}
