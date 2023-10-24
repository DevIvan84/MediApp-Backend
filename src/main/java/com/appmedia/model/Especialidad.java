package com.appmedia.model;

import javax.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspecialidad;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = true, length = 50)
    private String descripcion;
}
