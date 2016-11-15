
package fonaments.models.entitats;

public class Cercle extends Shape{
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
    private double diametro;
    private double  pi;


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


    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

            public Cercle(double diametro, double pi){
                this(new AlphaColor(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), new AlphaColor(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE), diametro, Math.PI);
            }
            
            public Cercle(AlphaColor backgroundColor, AlphaColor foregroundColor, double diametro, double pi){
                super(backgroundColor, foregroundColor);
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
