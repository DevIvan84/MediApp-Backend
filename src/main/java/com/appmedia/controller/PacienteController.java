package com.appmedia.controller;

import com.appmedia.model.Paciente;
import com.appmedia.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    
    private IPacienteService service;
    

    public PacienteController(IPacienteService service) {
		super();
		this.service = service;
	}

	@GetMapping
    public List<Paciente> listar() throws Exception {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Paciente listarPorId(@PathVariable("id") Integer id) throws Exception {
        return service.listarPorId(id);
    }

    @PostMapping
    public Paciente registrar(@RequestBody Paciente paciente) throws Exception {
        return service.registrar(paciente);
    }

    @PutMapping
    public Paciente modificar(@RequestBody Paciente paciente) throws Exception {
        return service.registrar(paciente);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) throws Exception {
        service.eliminar(id);
    }


}
