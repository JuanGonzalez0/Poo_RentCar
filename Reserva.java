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
        this.fechaFin = calcularFechaFin();
    }

    public Reserva(Cliente cli, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cli = cli;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantDias = this.calcularDias();
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
    
    public LocalDate calcularFechaFin(){
        this.fechaFin = fechaInicio.plusDays(cantDias);
        return fechaFin;

    }
    public double totalRenta(){
        return this.precioAuto * cantDias;
    }
    public void imprimirTicket(){
        System.out.println("Cliente: ");
        cli.toString();
        System.out.println("fecha de inicio: " + fechaInicio);
        System.out.println("fecha Final: " + fechaFin);
        for(Auto x: arrayAuto){
            System.out.println("Auto: ");
            x.mostrarDatos();
        }
        
    }

}
