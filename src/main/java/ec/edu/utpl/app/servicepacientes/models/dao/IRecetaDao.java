package ec.edu.utpl.app.servicepacientes.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.utpl.app.servicepacientes.models.entity.Receta;

public interface IRecetaDao extends JpaRepository<Receta, Long> {

}
