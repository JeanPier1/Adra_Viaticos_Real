package pe.edu.adra.biaticos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Login.Persona;


@Repository
public interface PersonaDao extends JpaRepository<Persona, Long>{
	
	@Query("select p from Persona p where LOWER(p.nombre) like LOWER(?1)||'%'")
	public List<Persona> FindPersonaByNombre(String nombre);
	
}
