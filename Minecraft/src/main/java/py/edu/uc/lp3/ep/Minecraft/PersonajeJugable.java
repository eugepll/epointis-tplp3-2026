package py.edu.uc.lp3.ep.Minecraft;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa al avatar controlado por el usuario.
 */
public class PersonajeJugable extends EntidadViva {
    private float hambre;
    private boolean controlable;
    private List<String> inventario; // Reemplazar 'String' por la clase 'Item' de tu juego

    public PersonajeJugable(float vida, String nombre, float altura, float hambre) {
        super(vida, nombre, altura);
        this.hambre = hambre;
        this.controlable = true; // Por defecto es controlado por el jugador
        this.inventario = new ArrayList<>();
    }

    // Getters y Setters
    public float getHambre() {
        return hambre;
    }

    public void setHambre(float hambre) {
        this.hambre = hambre;
    }

    public boolean isControlable() {
        return controlable;
    }

    public void setControlable(boolean controlable) {
        this.controlable = controlable;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public void agregarAlInventario(String item) {
        this.inventario.add(item);
    }
}