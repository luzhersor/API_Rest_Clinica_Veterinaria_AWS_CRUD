
package com.luz.clinicavet.service;

import com.luz.clinicavet.dto.MascoDuenoDTO;
import com.luz.clinicavet.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    
    public List<Mascota> getMascotas();
    
    public void saveMascota(Mascota mas);
    
    public void deleteMascota(Long id_mascota);
    
    public void editMascota(Mascota mas);
    
    public Mascota findMascota(Long id_mascota);
    
    public List<MascoDuenoDTO> getMascoDuenoDTO();
    
    public List<Mascota> getCaniche();
    
    
}
