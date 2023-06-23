package rentcar;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Reserva {

    private static Object Auto;

    protected ArrayList<Auto> arrayAuto = new ArrayList();
    protected Cliente cli;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected int cantDias;
    protected double precioAuto;

    public double getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(double precioAuto) {
        this.precioAuto = precioAuto;
    }

    public Reserva(Cliente cli, int cantDias) {
        this.cli = cli;
        this.cantDias = cantDias;
    }

    public Reserva(Cliente cli, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cli = cli;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public static Object getAuto() {
        return Auto;
    }

    public static void setAuto(Object Auto) {
        Reserva.Auto = Auto;
    }

    public ArrayList<Auto> getArrayAuto() {
        return arrayAuto;
    }

    public void setArrayAuto(ArrayList<Auto> arrayAuto) {
        this.arrayAuto = arrayAuto;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }
    
    public void agregarAuto(rentcar.Auto a){
        this.arrayAuto.add(a);
    }
    public int calcularDias(){
        Period periodo = Period.between(fechaInicio, fechaFin);
        return periodo.getDays();
    }
    
    public void calcularFechaFin(){
        fechaFin = fechaInicio.plusDays(cantDias);

    }
    public double totalRenta(){
        return this.precioAuto * cantDias;
    }
    public void imprimirTicket(){
        System.out.println("Cliente: " + cli);
        System.out.println("fecha de inicio: " + fechaInicio);
        System.out.println("fecha Final: " + fechaFin);
        for(int x = 0; x < arrayAuto.size(); x++){
            System.out.println("Auto: " + arrayAuto.get(x));
        }
        
    }

}
