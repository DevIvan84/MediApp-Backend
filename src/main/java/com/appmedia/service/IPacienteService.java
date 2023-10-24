package com.appmedia.service;

import com.appmedia.model.Paciente;

import java.util.List;

public interface IPacienteService {

    Paciente registrar(Paciente paciente) throws Exception;

    Paciente modificar(Paciente paciente) throws Exception;

    List<Paciente> listar() throws Exception;

    Paciente listarPorId(Integer id) throws Exception;

    void eliminar(Integer id) throws Exception;
}
