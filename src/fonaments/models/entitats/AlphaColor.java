

package fonaments.models.entitats;

public class AlphaColor extends Color{

//<editor-fold defaultstate="collapsed" desc="Atributs">
    private double Alpha;
    
    public static final double DEF_ALPHA = 0;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters / Setters">
        //Alpha
        public double getAlpha(){
            return Alpha;
        }
        public void setAlpha(double Alpha){
            if(Alpha < 0 || Alpha > 1){
                throw new IllegalArgumentException(String.format("El valor Alpha no pot ser menor a 0 o mayor a 1."));
            }
            this.Alpha = Alpha;
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public AlphaColor(int red, int green, int blue, double Alpha){
            super(red, green, blue);
            this.setAlpha(Alpha);
        }
        
        public AlphaColor(int red, int green, int blue){
            this(red, green, blue, DEF_ALPHA);

        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritures">
    @Override
        public String toRGBString(boolean upper){
            return String.format("%s %n AlphaColor %.1f %n",
                    super.toRGBString(upper), getAlpha());
        }
        
    @Override
        public String toRGBString(){
            return toRGBString(true);
        }
    @Override
        public String toHexString(boolean upper){
            return String.format("%s %n AlphaColor %.1f %n",
                    super.toHexString(upper), getAlpha());
        }

    @Override
        public String toHexString(){
            return toHexString(true);
        }
    //</editor-fold>

//</editor-fold>
}
