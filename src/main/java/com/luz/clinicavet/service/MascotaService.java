
package com.luz.clinicavet.service;

import ch.qos.logback.core.CoreConstants;
import com.luz.clinicavet.dto.MascoDuenoDTO;
import com.luz.clinicavet.model.Mascota;
import com.luz.clinicavet.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    //Inyección del Repository
    @Autowired
    private IMascotaRepository mascotaRepo;
    
    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascotaRepo.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mas) {
        mascotaRepo.save(mas);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascotaRepo.deleteById(id_mascota);
    }

    @Override
    public void editMascota(Mascota mas) {
        this.saveMascota(mas);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota mas = mascotaRepo.findById(id_mascota).orElse(null);
        return mas;
    }

    @Override
    public List<MascoDuenoDTO> getMascoDuenoDTO() {
        //Asignando a la listaMascoDueno todos los objetos "mascota" para que sean recorridos en el FOR
       List<Mascota> listaMascotas = this.getMascotas();
       
       //Creando Lista para al finalizar el FOR agregar el nuevo objeto MascoDuenoDTO
       List <MascoDuenoDTO> listaMascotaDueno = new ArrayList<MascoDuenoDTO>();
       
       //Implementando un objeto de tipo MascoDueñoDTO
       //Implementando el objeto masco_dueno de la clase MascoDueñoDTO
       MascoDuenoDTO masco_dueno = new MascoDuenoDTO();
       
       //En el for estoy instanciando el objeto masco de tipo Mascota
       for (Mascota masco:listaMascotas){
          
           System.out.println(masco.getNombre());
           masco_dueno.setNombre_dueno(masco.getUnDueno().getNombre());
           masco_dueno.setNombre_mascota(masco.getNombre());
           masco_dueno.setNombre_apellido(masco.getUnDueno().getApellido());
           masco_dueno.setEspecie(masco.getEspecie());
           masco_dueno.setRaza(masco.getRaza());
           
           //Agregando el objeto del for a la lista para return al finalizar el método
           listaMascotaDueno.add(masco_dueno);
           
           //Reseteando el objeto
           masco_dueno = new MascoDuenoDTO();
           
           
           }
         return listaMascotaDueno;
       }

    @Override
    public List<Mascota> getCaniche() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();
        
        
        for (Mascota masco:listaMascotas){
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")){
                listaCaniches.add(masco);
            }
        }
     return listaCaniches;
        
    }
      
   
    
    
}
