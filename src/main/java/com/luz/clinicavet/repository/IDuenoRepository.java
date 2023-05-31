
package com.luz.clinicavet.repository;
import com.luz.clinicavet.model.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenoRepository extends JpaRepository<Dueno, Long> {
    
}
