
package fonaments.models.entitats;

public class Rectangle extends Shape{
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
    private double  base;
    private double altura;

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
        public double getBase(){
            return base;
        }
        public double getAltura(){
            return altura;
        }
        public void setBase(double base){
                if(base <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", base));
                }
            this.base = base;
        }
        public void setAltura(double altura){
                 if(base <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", altura));
                }
            this.altura = altura;
        }
       
        
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
            
            public Rectangle(double base, double altura){
               this(new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE), base, altura);

            }
            
            public Rectangle(Color backgroundColor, Color foregroundColor, double base, double altura){
                super(backgroundColor, foregroundColor);
                this.setBase(base);
                this.setAltura(altura);
            }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea(){
            return getBase() * getAltura();
        }
        public double getPerimeter(){
            return (2 * getBase()) + (2 * getAltura());
        }
    //</editor-fold>

//</editor-fold>
    
}
