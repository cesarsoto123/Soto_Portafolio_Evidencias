/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos.Secuenciacion.Sec_P05_MMPR;

/**
 *
 * @author cesar
 */
public class MMPR_Clase_Base implements MMPR_Interface{
  private double numero, suma, menor, mayor, promedio, rango, contador;

    public MMPR_Clase_Base() {
        
    }

  @Override
    public void setNumero(double numero) {
        this.numero = numero;
    }

  @Override
    public void setSuma(double numero) {
        this.suma=this.suma+numero;
    }
    

  @Override
    public void setMenor(double numero) {
        
        if (contador == 0) {
            menor = numero;
        } else {
            if (menor > numero) {
                menor = numero;
            }
        }
        
    }

  @Override
    public void setMayor(double numero) {
       if (contador == 0) {
            mayor = numero;
        } else {
            if (mayor < numero) {
                mayor = numero;
            }
        }
    }

  @Override
    public void setPromedio() {
       this.promedio = suma / contador;
        
    }

  @Override
    public void setRango() {
       this.rango = (mayor - menor);
    }

    

  @Override
    public void setContador() {
        this.contador++;
    }
    public void setCeroTodo(){
        this.contador=0;
        this.suma=0;
    }

  @Override
    public double getMenor() {
        return menor;
    }

  @Override
    public double getMayor() {
        return mayor;
    }

  @Override
    public double getPromedio() {
        return promedio;
    }

  @Override
    public double getRango() {
        return rango;
    }

  @Override
    public double getContador() {
        return contador;
    }

  @Override
    public double getSuma() {
        return suma;
    }
}
