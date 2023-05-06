
package Modelos.Secuenciacion.Sec_P02_Menor_Mayor;


public class Menor_Mayor_Clase_Base implements Menor_Mayor_Interface{
    private double num1,num2,num3,mayor,menor,medio;
   
   
    public Menor_Mayor_Clase_Base(double num1,double num2, double num3){
        this.num1= num1;
        this.num2= num2;
        this.num3= num3;
    }

    public void setNum1(double Num1) {
        this.num1 = Num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public void setMayor() {
        mayor = num1;

        if (num2 > mayor) {
            mayor = num2;

        }
        if (num3 > mayor) {
            mayor = num3;

        }
        this.mayor = mayor;
    }

    public void setMenor() {
       menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        this.menor = menor;
    }

    public void setMedio() {
        if ((num1 == mayor || num1 == menor) && (num2 == mayor || num2 == menor)) {
            this.medio = num3;

        } else {
            if ((num1 == mayor || num1 == menor) && (num3 == mayor || num3 == menor)) {
                this.medio = num2;
            } else {
                if ((num2 == mayor || num2 == menor) && (num3 == mayor || num3 == menor)) {
                    this.medio = num1;
                }else{
                    
                }
            }

        }
    }

    public double getMayor() {
        return mayor;
    }

    public double getMenor() {
        return menor;
    }

    public double getMedio() {
        return medio;
    }
    
    
}
