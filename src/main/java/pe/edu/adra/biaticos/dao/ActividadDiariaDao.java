package pe.edu.adra.biaticos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Informe.ActividadDiaria;

@Repository
public interface ActividadDiariaDao extends JpaRepository<ActividadDiaria, Long>{
	
}
