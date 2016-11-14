

package fonaments.models.entitats;

public abstract class Shape {


//<editor-fold defaultstate="collapsed" desc="Atributs">
    private Color backgroundColor;
    private Color foregroundColor;
    
    private static int counter;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Color getBackgroundColor(){
        return backgroundColor;
    }
    public void setBackgroundColor(Color backgroundColor){
        if(backgroundColor == null){
            throw new NullPointerException("Es obligatori indicar el color de fons");
        }
        this.backgroundColor = backgroundColor;
    }
    
    public Color getForegroundColor(){
        return foregroundColor;
    }
    public void setForegroundColor(Color foregroundColor){
        if(foregroundColor == null){
            throw new NullPointerException("Es obligatori indicar el color de fons");
        }
        this.foregroundColor = foregroundColor;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Shape(Color backgroundColor, Color foregroundColor){
            this.setBackgroundColor(backgroundColor);
            this.setForegroundColor(foregroundColor);
            counter++;
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Mètodes Estatics">
        public static int getCounter(){
            return counter;
        }
    //</editor-fold>
//</editor-fold>

}
