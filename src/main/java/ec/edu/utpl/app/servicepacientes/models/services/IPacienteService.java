package ec.edu.utpl.app.servicepacientes.models.services;

import java.util.List;

import ec.edu.utpl.app.servicepacientes.models.entity.Paciente;

public interface IPacienteService {

	public List<Paciente> listAll();

	public Paciente save(Paciente paciente);

	public Paciente findById(Long id);

	public void delete(Long id);

}
