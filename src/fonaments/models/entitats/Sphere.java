
package fonaments.models.entitats;

public class Sphere {
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
    private double radi;
    private double  pi;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
        public double getRadi(){
            return radi;
        }
        public double getPi(){
            return pi;
        }
        public void setRadi(double radi){
                if(radi <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", radi));
                }
            this.radi = radi;
        }
        public void setPi(double pi){
            this.pi = pi;
        }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
            
            public Sphere(double radi, double pi){
                this.setRadi(radi);
                this.setPi(pi);
            }
            
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getVolumen(){
            return (4 * getPi() * Math.pow(getRadi(), 3))/3;
        }
    //</editor-fold>

//</editor-fold>
        
}
