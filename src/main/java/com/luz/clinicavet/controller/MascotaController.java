
package com.luz.clinicavet.controller;

import com.luz.clinicavet.dto.MascoDuenoDTO;
import com.luz.clinicavet.model.Mascota;
import com.luz.clinicavet.service.MascotaService;
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
public class MascotaController {
    
    //Inyección del Service
    @Autowired
    private MascotaService mascotaServ;
    
    @GetMapping("/mascotas/traer")
        public List<Mascota> getMascotas(){
            return mascotaServ.getMascotas();
        }
            
            
    @PostMapping("/mascotas/crear")
        public String saveMascota(@RequestBody Mascota mas){
            mascotaServ.saveMascota(mas);
            return "Mascota creada exitosamente";
        }
    
    @DeleteMapping("/mascotas/borrar/{id_mascota}")
        public String deleteMascota(@PathVariable Long id_mascota){
           mascotaServ.deleteMascota(id_mascota);
           return "Mascota eliminada exitosamente";
        }
    
    @PutMapping("/mascotas/editar")
            public Mascota editMascota(@RequestBody Mascota mas){
                mascotaServ.editMascota(mas);
                return mascotaServ.findMascota(mas.getId_mascota());
            }
            
    @GetMapping("/mascotas/mascoDTO")
            public List<MascoDuenoDTO> getMascoDuenoDTO(){
                return mascotaServ.getMascoDuenoDTO();
            }
            
    @GetMapping("/mascotas/caniches")
            public List<Mascota> getCaniches(){
                return mascotaServ.getCaniche();
            }
    
   
    
            
    
}
