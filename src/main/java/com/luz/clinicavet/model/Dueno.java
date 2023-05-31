
package com.luz.clinicavet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Dueno {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_dueno;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    public Dueno() {
    }

    public Dueno(Long id_dueno, String dni, String nombre, String apellido, String celular) {
        this.id_dueno = id_dueno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    
}
