package com.appmedia.service.impl;

import com.appmedia.model.Paciente;
import com.appmedia.repo.IPacienteRepo;
import com.appmedia.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements IPacienteService {

    private IPacienteRepo repo;

    public PacienteServiceImpl(IPacienteRepo repo) {
        this.repo = repo;
    }

    @Override
    public Paciente registrar(Paciente paciente) throws Exception {
        return repo.save(paciente);
    }

    @Override
    public Paciente modificar(Paciente paciente) throws Exception {
        return repo.save(paciente);
    }

    @Override
    public List<Paciente> listar() throws Exception {
        return repo.findAll();
    }

    @Override
    public Paciente listarPorId(Integer id) throws Exception {

        Optional<Paciente> opt = repo.findById(id);

        return opt.orElseGet(Paciente::new);
    }

    @Override
    public void eliminar(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
