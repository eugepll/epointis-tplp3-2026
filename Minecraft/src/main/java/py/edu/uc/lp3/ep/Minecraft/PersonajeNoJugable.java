package py.edu.uc.lp3.ep.Minecraft;

/**
 * Clase base abstracta para todas las entidades autónomas (NPCs).
 */
public abstract class PersonajeNoJugable extends EntidadViva {
    private boolean controlable;
    private boolean crecen;

    public PersonajeNoJugable(float vida, String nombre, float altura, boolean crecen) {
        super(vida, nombre, altura);
        this.controlable = false; // Por defecto no es controlado por un jugador
        this.crecen = crecen;
    }

    // Getters y Setters
    public boolean isControlable() {
        return controlable;
    }

    public void setControlable(boolean controlable) {
        this.controlable = controlable;
    }

    public boolean isCrecen() {
        return crecen;
    }

    public void setCrecen(boolean crecen) {
        this.crecen = crecen;
    }
/* 
    public boolean isDeambula() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isDeambula'");
    }*/
}