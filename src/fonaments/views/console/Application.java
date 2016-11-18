package fonaments.views.console;

import fonaments.models.entitats.Cercle;
import fonaments.models.entitats.Rectangle;
import fonaments.models.entitats.Sphere;
import fonaments.models.entitats.Square;
import fonaments.models.entitats.Color;
import fonaments.models.entitats.AlphaColor;
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
           main(args);
       break;

       case 2:
           Cercle();
           main(args);
       break;

       case 3:      
           Rectangle();
           main(args);
       break;
       
       case 4:
           Sphere();
           main(args);
       break;

        }
    }
    
//<editor-fold defaultstate="collapsed" desc="Entitats">
    //<editor-fold defaultstate="collapsed" desc="Square">
    public static void Square(){
        Scanner input = new Scanner(System.in);
        //Variables Square
        double side;
        
        //Variables Alpha/Color
        int red=60, green=50, blue=30;
        double Alpha;
        
        
        //Mida Square
            System.out.printf("%nDigam una mida del costat: ");
            side = input.nextDouble();
        //Dada AlphaColor 
            System.out.printf("%nDigam un nivell de transparencia [0. Opac / 1. Transparent]: ");
            Alpha = input.nextDouble();
            //Background i Foreground con Alpha
            AlphaColor backgroundColor = new AlphaColor(255, 255, 255, Alpha);
            AlphaColor foregroundColor = new AlphaColor(0, 0, 0, Alpha);
            //Square con colores
            Square c1 = new Square(backgroundColor, foregroundColor, side);
            AlphaColor ac1 = new AlphaColor(red, green, blue, Alpha);
                System.out.printf("%n %s %n", c1.toString());
                System.out.printf("Contador: %d %n", c1.getCounter());
                
                System.out.printf("%s %n", ac1.toRGBString());
                System.out.printf("%s %n", ac1.toHexString());
            
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Cercle">
    public static void Cercle(){
        Scanner input = new Scanner(System.in);
        double diametro;
        double pi = Math.PI;
        
        //Variables Alpha/Color
        int red=80, green=90, blue=100;

            //Pide el diametro
            System.out.println("Digam una mida del diametre: ");
            diametro = input.nextDouble();
            //Background i Foreground con Alpha
            AlphaColor backgroundColor = new AlphaColor(255, 255, 255, 0.6);
            AlphaColor foregroundColor = new AlphaColor(0, 0, 0, 0.5);
            //Crea circulo y un alphacolor
            Cercle cir1 = new Cercle(backgroundColor, foregroundColor, diametro, pi);
             AlphaColor ac2 = new AlphaColor(red, green, blue);
             
                System.out.printf("%n %s %n", cir1.toString());
                System.out.printf("Contador: %d %n", cir1.getCounter());
                
                System.out.printf("%s %n", ac2.toRGBString());
                System.out.printf("%s %n", ac2.toHexString());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Rectangle">
    public static void Rectangle(){
        Scanner input = new Scanner(System.in);
        double base;
        double altura;
        
        //Variables Alpha/Color
        int red=50, green=60, blue=70;
        double Alpha;
        
            System.out.printf("%nDigam una mida de l'altura: ");
            altura = input.nextDouble();
            System.out.printf("%nDigam una mida de la base: ");
            base = input.nextDouble();
            //Dada AlphaColor 
            System.out.printf("%nDigam un nivell de transparencia [0. Opac / 1. Transparent]: ");
            Alpha = input.nextDouble();
            //Background i Foreground con Alpha
            AlphaColor backgroundColor = new AlphaColor(255, 255, 255, Alpha);
            AlphaColor foregroundColor = new AlphaColor(0, 0, 0, Alpha);
            //Crea un rectangulo y un AlphaColor
            Rectangle rec1 = new Rectangle(backgroundColor, foregroundColor, base, altura);
             AlphaColor ac3 = new AlphaColor(red, green, blue, Alpha);
             
                System.out.printf("%n %s %n", rec1.toString());
                System.out.printf("Contador: %d %n", rec1.getCounter());
                
                System.out.printf("%s %n", ac3.toRGBString());
                System.out.printf("%s %n", ac3.toHexString());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Sphere">
        public static void Sphere(){
            Scanner input = new Scanner(System.in);
            double radi;
            double pi = Math.PI;
            
            //Variables Alpha/Color
            int red=20, green=30, blue=40;
            double Alpha;
            System.out.printf("%nDigam una mida del radi: ");
            radi = input.nextDouble();
            //Dada AlphaColor 
            System.out.printf("%nDigam un nivell de transparencia [0. Opac / 1. Transparent]: ");
            Alpha = input.nextDouble();
            //Background i Foreground con Alpha
            AlphaColor backgroundColor = new AlphaColor(255, 255, 255, Alpha);
            AlphaColor foregroundColor = new AlphaColor(0, 0, 0, Alpha);
            //Crea una esfera y un alphacolor
            Sphere s1 = new Sphere(backgroundColor, foregroundColor, radi, pi);
            AlphaColor ac4 = new AlphaColor(red, green, blue, Alpha);
             
                System.out.printf("%n %s %n", s1.toString());
                System.out.printf("Contador: %d %n", s1.getCounter());
                
                System.out.printf("%s %n", ac4.toRGBString());
                System.out.printf("%s %n", ac4.toHexString());
        }
    //</editor-fold>
//</editor-fold>
}
