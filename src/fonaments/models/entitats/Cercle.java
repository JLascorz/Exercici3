
package fonaments.models.entitats;

public class Cercle {
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
    private double diametro;
    private double  pi;

    private Color backgroundColor;
    private Color foregroundColor;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
        public double getDiametro(){
            return diametro;
        }
        public double getPi(){
            return pi;
        }
        public void setDiametro(double diametro){
               if(diametro <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", diametro));
                }
            this.diametro = diametro;
        }
        public void setPi(double pi){
            this.pi = pi;
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

            public Cercle(double diametro, double pi){
                this(new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE), diametro, Math.PI);
            }
            
            public Cercle(Color backgroundColor, Color foregroundColor, double diametro, double pi){
                this.setBackgroundColor(backgroundColor);
                this.setForegroundColor(foregroundColor);
                this.setDiametro(diametro);
                this.setPi(pi);
            }
            

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea(){
            return Math.pow(getDiametro(), 2)/4;
        }
        public double getPerimeter(){
            return getDiametro() * getPi();
        }
    //</editor-fold>

//</editor-fold>
        

}
