
package com.luz.clinicavet.service;
import com.luz.clinicavet.model.Dueno;
import java.util.List;


public interface IDuenoService {
        
    public List<Dueno> getDuenos();
    
    public void saveDueno(Dueno due);
    
    public void deleteDueno(Long id_dueno);
    
    public void editDueno(Dueno due);
    
    public Dueno findDueno(Long id_dueno);
}
