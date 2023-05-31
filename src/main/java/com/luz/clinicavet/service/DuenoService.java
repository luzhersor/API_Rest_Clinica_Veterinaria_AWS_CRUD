
package com.luz.clinicavet.service;

import com.luz.clinicavet.model.Dueno;
import com.luz.clinicavet.repository.IDuenoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenoService implements IDuenoService {
    
    //Inyección de dependecias
    @Autowired
    private IDuenoRepository duenoRepository;

    @Override
    public List<Dueno> getDuenos() {
            List<Dueno> listaDuenos = duenoRepository.findAll();
            return listaDuenos;
    }

    @Override
    public void saveDueno(Dueno due) {
        duenoRepository.save(due);
    }

    @Override
    public void deleteDueno(Long id_dueno) {
        duenoRepository.deleteById(id_dueno);
    }

    @Override
    public void editDueno(Dueno due) {
        this.saveDueno(due);
    }

    @Override
    public Dueno findDueno(Long id_dueno) {
        Dueno due = duenoRepository.findById(id_dueno).orElse(null);
        return due;
    }

}