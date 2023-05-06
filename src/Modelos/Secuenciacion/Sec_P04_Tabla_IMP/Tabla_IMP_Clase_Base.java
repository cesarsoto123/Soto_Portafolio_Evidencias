/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Secuenciacion.Sec_P04_Tabla_IMP;

/**
 *
 * @author cesar
 */
public class Tabla_IMP_Clase_Base implements Tabla_IMP_Interface{
    private int Porcentaje_Impuesto,Importe_Inicial,Importe_Final;
    private double Impuesto,Total;

    public Tabla_IMP_Clase_Base(int Porcentaje_Impuesto,int Importe_Inicial) {
        this.Importe_Inicial=Importe_Inicial;
        this.Porcentaje_Impuesto=Porcentaje_Impuesto;
    }

    @Override
    public void setImporte_Inicial(int Importe_Inicial) {
        this.Importe_Inicial = Importe_Inicial;
    }
    @Override
    public void setInc_Imp_Inicial() {
        this.Importe_Inicial++;
    }


    @Override
    public void setPorcentaje_Impuesto(int Porcentaje_Impuesto) {
        this.Porcentaje_Impuesto = Porcentaje_Impuesto;
    }

    @Override
    public void setImpuesto() {
        this.Impuesto = (double) (Importe_Inicial * Porcentaje_Impuesto) / 100;
    }

    @Override
    public void setTotal() {
        this.Total = this.Importe_Inicial + this.Impuesto;
    }

    @Override
    public int getImporte_Inicial() {
        return Importe_Inicial;
    }



    @Override
    public double getImpuesto() {
        return Impuesto;
    }

    @Override
    public double getTotal() {
        return Total;
    }
    

    

   
    
}
