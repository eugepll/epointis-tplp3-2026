package py.edu.uc.lp3.ep.Minecraft.domain;

public class Monstruo extends PersonajeNoJugable implements Interaccionable {
    private boolean hostil;
    private boolean puedeEstarArmado;
    private boolean deambulan;

    // Constructor unificado con todos los atributos necesarios
    public Monstruo(float vida, String nombre, float altura, boolean crecen, boolean hostil) {
        super(vida, nombre, altura, crecen);
        this.hostil = hostil;
    }

    @Override
    public String describirInteraccion() {
        return "¡Cuidado! El monstruo " + getNombre() + " se prepara para atacar.";
    }

    @Override
    public String obtenerTipoInteraccion() {
        return "Interacción de Combate / Hostil";
    }

    // Getters y Setters
    public boolean isHostil() { return hostil; }
    public void setHostil(boolean hostil) { this.hostil = hostil; }

    public boolean isPuedeEstarArmado() { return puedeEstarArmado; }
    public void setPuedeEstarArmado(boolean puedeEstarArmado) { this.puedeEstarArmado = puedeEstarArmado; }

    public boolean isDeambulan() { return deambulan; }
    public void setDeambulan(boolean deambulan) { this.deambulan = deambulan; }
}