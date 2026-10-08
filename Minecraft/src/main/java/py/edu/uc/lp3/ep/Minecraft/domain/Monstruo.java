package py.edu.uc.lp3.ep.Minecraft.domain;

public class Monstruo extends PersonajeNoJugable {
    public Monstruo(float vida, String nombre, float altura, boolean crecen) {
        super(vida, nombre, altura, crecen);
        //TODO Auto-generated constructor stub
    }

    private boolean hostil;
    private boolean puedeEstarArmado;
    private boolean deambulan;

    /* 
    public Monstruo(float vida, String nombre, float altura, boolean noControlable, boolean crecen, boolean hostil, boolean puedeEstarArmado, boolean deambulan) {
        //super(vida, nombre, altura, noControlable, crecen);
        this.hostil = hostil;
        this.puedeEstarArmado = puedeEstarArmado;
        this.deambulan = deambulan;
    }
*/
    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public boolean isPuedeEstarArmado() {
        return puedeEstarArmado;
    }

    public void setPuedeEstarArmado(boolean puedeEstarArmado) {
        this.puedeEstarArmado = puedeEstarArmado;
    }

    public boolean isDeambulan() {
        return deambulan;
    }

    public void setDeambulan(boolean deambulan) {
        this.deambulan = deambulan;
    }
}