package pe.edu.adra.biaticos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Gastos.Categoria;


@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Long> {

}
