package pe.edu.adra.biaticos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Viajes.Viaje;


 @Repository
public interface ViajeDao extends JpaRepository<Viaje, Long>{
	 
	 @Query("select v from Viaje v, Persona p where p.idPersona = v.persona.idPersona and p.idPersona = ?1 and v.estado = 2")
	 public List<Viaje> findViajeSuccess(Long idPersona);
	 
	 @Query("select v from Viaje v, Persona p where p.idPersona = v.persona.idPersona and p.idPersona = ?1")
	 public List<Viaje> findAllById(Long idPersona);
	 
}
