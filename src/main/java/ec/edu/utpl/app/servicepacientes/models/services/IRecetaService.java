package ec.edu.utpl.app.servicepacientes.models.services;

import java.util.List;

import ec.edu.utpl.app.servicepacientes.models.entity.Receta;

public interface IRecetaService {

	public List<Receta> listAll();

	public Receta save(Receta receta);

	public Receta findById(Long id);

	public void delete(Long id);

}
