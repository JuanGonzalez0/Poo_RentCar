package rentcar;

public class Cliente {
    protected int dni;
    protected String nombre;
    protected int telefono;
    protected String direccion;
    protected int codigoCliente;

    public Cliente(int dni, String nombre, int telefono, String direccion, int codigoCliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoCliente = codigoCliente;
    }
     public void cargarDatosCliente() {
        System.out.println( "CLIENTE " + "NOMBRE= " + nombre + ", DNI= " + dni + ", direccion= " + direccion + ", Codigo de Cliente= " + codigoCliente + ", telefono= " + telefono);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
