package py.edu.uc.lp3.dto; // O el paquete que estés usando para tus DTOs

public class InteraccionResponse {
    private String nombre;
    private String tipoInteraccion;
    private String descripcion;

    public InteraccionResponse(String nombre, String tipoInteraccion, String descripcion) {
        this.nombre = nombre;
        this.tipoInteraccion = tipoInteraccion;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getTipoInteraccion() { return tipoInteraccion; }
    public String getDescripcion() { return descripcion; }
}