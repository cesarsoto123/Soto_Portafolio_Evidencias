
package Modelos.Secuenciacion.Sec_P01_Evaluar_Y;


public class Calcular_Y_Clase_Base implements Calcular_Y_Interface{
    private double a,b,x,Y;
   public Calcular_Y_Clase_Base(){
       
   }
    public Calcular_Y_Clase_Base(double a, double b, double x){
       this.a=a;
       
       this.b=b;
       
       this.x=x;
   }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    
    public void setX(double x) {
        this.x = x;
    }

    
    public void setY() {
        if (x < 0) {
            this.Y =(10 * a - 2 * b);
        } else if (x > 0 && x <= 20) {
            this.Y=(Math.abs(40 * a - b));
        } else if (x > 20) {
        this.Y=(Math.abs(50 * a - 2 * b));
        }
    }

   
    public double getY() {
        return Y;
    }
    
}
