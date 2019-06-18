package pe.edu.adra.biaticos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Gastos.Gasto;


@Repository
public interface GastoDao extends JpaRepository<Gasto, Long> {

}
