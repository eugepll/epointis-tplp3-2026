package py.edu.uc.lp3.ep.Minecraft.domain;

/**
 * Representa criaturas pacificas o neutrales en el mundo.
 */
public class Animal extends PersonajeNoJugable {
    private boolean domable;
    private boolean pacifico;
    private boolean deambulan;

    public Animal(float vida, String nombre, float altura, boolean crecen, boolean domable, boolean pacifico, boolean deambula) {
        super(vida, nombre, altura, crecen);
        this.domable = domable;
        this.pacifico = pacifico;
        this.deambulan = deambula;
    }

    // Getters y Setters
    public boolean isDomable() {
        return domable;
    }

    public void setDomable(boolean domable) {
        this.domable = domable;
    }

    public boolean isPacifico() {
        return pacifico;
    }

    public void setPacifico(boolean pacifico) {
        this.pacifico = pacifico;
    }

    public boolean isDeambulan() {
        return deambulan;
    }

    public void setDeambulan(boolean deambulan) {
        this.deambulan = deambulan;
    }
}
