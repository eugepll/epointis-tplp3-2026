package py.edu.uc.lp3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Importaciones correctas según tu estructura de carpetas:
import py.edu.uc.lp3.ep.Minecraft.domain.Animal;
import py.edu.uc.lp3.ep.Minecraft.domain.Interaccionable;
import py.edu.uc.lp3.ep.Minecraft.domain.Monstruo;
import py.edu.uc.lp3.dto.InteraccionResponse;

@RestController
@RequestMapping("/api/entidades")
public class EntidadController {

    @GetMapping("/interaccion/{tipo}")
    public InteraccionResponse obtenerInteraccion(@PathVariable String tipo) {
        Interaccionable entidad; 
        String nombreEntidad;

        if ("zombie".equalsIgnoreCase(tipo)) {
            Monstruo m = new Monstruo(20f, "Zombie", 1.95f, false, true);
            entidad = m; 
            nombreEntidad = m.getNombre();
        } else {
            Animal a = new Animal(10f, "Vaca", 1.4f, true, true);
            entidad = a; 
            nombreEntidad = a.getNombre();
        }

        return new InteraccionResponse(
            nombreEntidad,
            entidad.obtenerTipoInteraccion(), 
            entidad.describirInteraccion()    
        );
    }
}