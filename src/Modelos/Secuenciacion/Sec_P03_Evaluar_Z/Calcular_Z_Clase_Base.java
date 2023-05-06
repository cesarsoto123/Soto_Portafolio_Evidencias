/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Secuenciacion.Sec_P03_Evaluar_Z;

/**
 *
 * @author cesar
 */
public class Calcular_Z_Clase_Base implements Calcular_Z_Interface{
    private double a,b,c,z;

    public Calcular_Z_Clase_Base(double a, double b, double c) {
        this.a= a;
        this.b= b;
        this.c=c;
    }

   
    public void setA(double a) {
        this.a = a;
    }

    
    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

  
    public void setZ() {
        this.z = (((Math.abs(a-b))/c)+(Math.abs(c-a)));
    }

    
    public double getZ() {
        return z;
    }

    
    
    
}
