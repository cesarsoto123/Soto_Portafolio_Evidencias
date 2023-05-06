package Modelos.Secuenciacion.Sec_P00_Cheques;

public class Empleado_Clase_Base implements Empleado_Interface {

    private String nombreEmp;
    private int horasTrab;
    private double cuotaHora;
    private double sueldo;

    public Empleado_Clase_Base() {
    }

    public Empleado_Clase_Base(String nombreEmp, int horasTrab, double cuaotaHora) {
        this.nombreEmp = nombreEmp;
        this.horasTrab = horasTrab;
        this.cuotaHora = cuaotaHora;
    }

    @Override
    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    @Override
    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    @Override
    public void setCuaotaHora(double cuotaHora) {
        this.cuotaHora = cuotaHora;
    }

    @Override
    public void setSueldo() {
        this.sueldo = cuotaHora*horasTrab;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }
    

   
    
    

}
