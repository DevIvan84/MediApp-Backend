package com.appmedia.repo;

import com.appmedia.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IPacienteRepo extends JpaRepository<Paciente,Integer> {

}
