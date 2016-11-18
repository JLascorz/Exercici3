

package fonaments.models.entitats;

public abstract class Shape {


//<editor-fold defaultstate="collapsed" desc="Atributs">
    private AlphaColor backgroundColor;
    private AlphaColor foregroundColor;
    
    private static int counter;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public AlphaColor getBackgroundColor(){
        return backgroundColor;
    }
    public void setBackgroundColor(AlphaColor backgroundColor){
        if(backgroundColor == null){
            throw new NullPointerException("Es obligatori indicar el color de fons");
        }
        this.backgroundColor = backgroundColor;
    }
    
    public AlphaColor getForegroundColor(){
        return foregroundColor;
    }
    public void setForegroundColor(AlphaColor foregroundColor){
        if(foregroundColor == null){
            throw new NullPointerException("Es obligatori indicar el color de fons");
        }
        this.foregroundColor = foregroundColor;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Shape(AlphaColor backgroundColor, AlphaColor foregroundColor){
            this.setBackgroundColor(backgroundColor);
            this.setForegroundColor(foregroundColor);
            counter++;
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Mètodes Estatics">
        public static int getCounter(){
            return counter;
        }
        
        @Override
        public String toString() {
            return String.format("Color del fondo: %s %n Color del borde: %s %n", getBackgroundColor().toString(), getForegroundColor().toString()); //To change body of generated methods, choose Tools | Templates.
        }
        
    //</editor-fold>
//</editor-fold>



}
