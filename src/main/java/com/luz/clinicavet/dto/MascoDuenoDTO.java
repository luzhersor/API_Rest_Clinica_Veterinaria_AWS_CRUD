package com.luz.clinicavet.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascoDuenoDTO {
    
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_dueno;
    private String nombre_apellido;

    public MascoDuenoDTO(String nombre_mascota, String especie, String raza, String nombre_dueno, String nombre_apellido) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_dueno = nombre_dueno;
        this.nombre_apellido = nombre_apellido;
    }

    public MascoDuenoDTO() {
    }
    
    
            
    
}
