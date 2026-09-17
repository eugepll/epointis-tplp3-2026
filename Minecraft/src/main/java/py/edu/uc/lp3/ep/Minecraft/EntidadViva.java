package py.edu.uc.lp3.ep.Minecraft;

public class EntidadViva {
    private float vida;
    private String nombre;
    private float altura;

    public EntidadViva(float vida, String nombre, float altura) {
        this.vida = vida;
        this.nombre = nombre;
        this.altura = altura;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}