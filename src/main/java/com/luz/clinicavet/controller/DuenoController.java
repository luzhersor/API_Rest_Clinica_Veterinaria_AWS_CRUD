
package com.luz.clinicavet.controller;

import com.luz.clinicavet.model.Dueno;
import com.luz.clinicavet.service.DuenoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenoController {
    
    @Autowired
    private DuenoService dueServ;
    //EndPoints
    
    
    @GetMapping("/duenos/traer")
    public List<Dueno> getDuenos(){
        return dueServ.getDuenos();
    }
    
    @PostMapping("/duenos/crear")
    public String saveDueno(@RequestBody Dueno due){
        dueServ.saveDueno(due);
        return "Dueno creado exitosamente";
    }
    
    @DeleteMapping("/duenos/borrar/{id_dueno}")
        public String deleteDueno(@PathVariable Long id_dueno){
            dueServ.deleteDueno(id_dueno);
            return "El dueño fue eliminado con éxito";
        }
    
    @PutMapping("/duenos/editar")
        public Dueno editPersona(@RequestBody Dueno due){
            dueServ.editDueno(due);
            
            return dueServ.findDueno(due.getId_dueno());
        }
    
}
