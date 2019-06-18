package pe.edu.adra.biaticos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Viajes.Presupuesto;


@Repository
public interface PresupuestoDao extends JpaRepository<Presupuesto, Long>{

}
