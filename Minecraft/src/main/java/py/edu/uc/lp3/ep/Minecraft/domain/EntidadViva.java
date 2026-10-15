package py.edu.uc.lp3.ep.Minecraft.domain;

public abstract class EntidadViva implements UICapable {
    private float vida;
    private String nombre;
    private float altura;
    private boolean crecen;

    public EntidadViva(float vida, String nombre, float altura, boolean crecen) {
        this.vida = vida;
        this.nombre = nombre;
        this.altura = altura;
        this.crecen = crecen;
    }

    // Implementación por defecto para la UI que todas las entidades comparten,
    // o pueden sobrescribir si lo necesitan.
    @Override
    public String obtenerRepresentacionUI() {
        return "Entidad [Nombre: " + nombre + ", Vida: " + vida + ", Altura: " + altura + "m]";
    }

    // Getters y Setters habituales
    public float getVida() { return vida; }
    public void setVida(float vida) { this.vida = vida; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }
    
    public boolean isCrecen() { return crecen; }
    public void setCrecen(boolean crecen) { this.crecen = crecen; }
}