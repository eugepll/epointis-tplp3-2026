package py.edu.uc.lp3.ep.Minecraft;

/**
 * Representa elementos estáticos de flora.
 */
public class Planta extends PersonajeNoJugable {
    private boolean estatico;

    public Planta(float vida, String nombre, float altura, boolean crecen) {
        super(vida, nombre, altura, crecen);
        this.estatico = true; // Por definición las plantas son estáticas
    }

    // Getters y Setters
    public boolean isEstatico() {
        return estatico;
    }

    public void setEstatico(boolean estatico) {
        this.estatico = estatico;
    }
}