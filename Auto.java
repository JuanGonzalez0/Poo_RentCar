package rentcar;

public class Auto {
    protected String patente;
    protected String modelo;
    protected String color;
    protected String marca;
    

    public Auto(String patente, String modelo, String color, String marca, double precioAuto) {
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;

    }


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    public void mostrarDatos(){
        System.out.println("Marca" + marca + " Modelo" + modelo + " color" + color + " Matricula" + patente);
    }
    
}

