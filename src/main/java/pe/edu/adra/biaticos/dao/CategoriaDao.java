package pe.edu.adra.biaticos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Gastos.Categoria;


@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Long> {

	@Query("select c from Categoria c where c.categoriaChid is null")
	public List<Categoria> findCategoriasPadre();
	
}
