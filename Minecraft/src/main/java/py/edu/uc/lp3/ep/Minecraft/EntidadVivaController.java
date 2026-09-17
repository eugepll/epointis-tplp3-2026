package py.edu.uc.lp3.ep.Minecraft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntidadVivaController {

    @GetMapping("/entidad")
    public EntidadViva crearEntidad(
            @RequestParam(value = "vida", defaultValue = "100.0") float vida,
            @RequestParam(value = "nombre", defaultValue = "Steve") String nombre,
            @RequestParam(value = "altura", defaultValue = "1.8") float altura) {
        
        // Crea y retorna la instancia utilizando los parámetros recibidos
        return new EntidadViva(vida, nombre, altura);
    }
}