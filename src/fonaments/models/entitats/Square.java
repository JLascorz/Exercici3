
package fonaments.models.entitats;

public class Square extends Shape {
    
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        private double  side;
        
//</editor-fold>
        
//<editor-fold defaultstate="collapsed" desc="Metodes">

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
        
            //Get Side
            public double getSide(){
                return side;
            }
            public void setSide(double side) {
                if(side <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", side));
                }
                this.side = side;
            }

    //</editor-fold>
            
    //<editor-fold defaultstate="collapsed" desc="Constructores">
            
            public Square(double side){
                this(new AlphaColor(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new AlphaColor(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE), side);
            }
            
            public Square(AlphaColor backgroundColor, AlphaColor foregroundColor, double side){
                super(backgroundColor, foregroundColor);
                this.setSide(side);
            }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea(){
            return Math.pow(getSide(), 2);
        }
        public double getPerimeter(){
            return getSide() * 4;
        }
    //</editor-fold>
//</editor-fold>

}
