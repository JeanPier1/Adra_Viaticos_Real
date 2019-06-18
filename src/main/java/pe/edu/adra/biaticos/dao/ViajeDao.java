package pe.edu.adra.biaticos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Viajes.Viaje;


 @Repository
public interface ViajeDao extends JpaRepository<Viaje, Long>{
	 
}
