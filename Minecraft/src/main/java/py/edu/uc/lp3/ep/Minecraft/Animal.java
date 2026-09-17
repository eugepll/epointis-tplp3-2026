package py.edu.uc.lp3.ep.Minecraft;


/**
 * Representa criaturas pacíficas o neutrales en el mundo.
 */
public class Animal extends PersonajeNoJugable {
    private boolean domable;
    private boolean pacifico;
   // private boolean deambula;

    public Animal(float vida, String nombre, float altura, boolean crecen, boolean domable, boolean pacifico, boolean deambula) {
        super(vida, nombre, altura, crecen);
        this.domable = domable;
        this.pacifico = pacifico;
       //this.deambula = deambula;
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

/* 
    @Override
    public boolean isDeambula() {
        return deambula;
    }

    @Override
    public void setDeambula(boolean deambula) {
        this.deambula = deambula;
    }

    @Override
    public void deambular() {
        if (deambula) {
            System.out.println("El animal " + getNombre() + " camina tranquilamente.");
        }
    } */
}
   