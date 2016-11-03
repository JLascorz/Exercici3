
package fonaments.models.entitats;

public class Square {
    
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        public double  side;
        
        private Color backgroundColor;
        private Color foregroundColor;
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

            //Get BackgroundColor
            public Color getBackgroundColor(){
                return backgroundColor;
            }
            public void setBackgroundColor(Color backgroundColor){
                this.backgroundColor = backgroundColor;
            }
            
            //Get ForegroundColor
            public Color getForegroundColor(){
                return foregroundColor;
            }
            public void setForegroundColor(Color foregroundColor){
                this.foregroundColor = foregroundColor;
            }
    //</editor-fold>
            
    //<editor-fold defaultstate="collapsed" desc="Constructores">
            
            public Square(double side){
                this(new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE), side);
            }
            
            public Square(Color backgroundColor, Color foregroundColor, double side){
                this.setBackgroundColor(backgroundColor);
                this.setForegroundColor(foregroundColor);
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
