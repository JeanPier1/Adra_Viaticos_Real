package pe.edu.adra.biaticos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Gastos.GastoDetalleCategoria;


@Repository
public interface GastoDetalleCategoriaDao extends JpaRepository<GastoDetalleCategoria, Long> {

}
