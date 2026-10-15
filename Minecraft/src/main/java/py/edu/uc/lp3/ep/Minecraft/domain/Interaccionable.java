package py.edu.uc.lp3.ep.Minecraft.domain;
public interface Interaccionable {
    // Método abstracto que devolverá texto
    String describirInteraccion();

    // Método default que una de las clases podrá sobrescribir
    default String obtenerTipoInteraccion() {
        return "Interacción genérica";
    }
}