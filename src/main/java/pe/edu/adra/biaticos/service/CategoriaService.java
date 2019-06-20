package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Gastos.Categoria;

public interface CategoriaService {
	
	List<Categoria> findCategoriasPadre();
	
}
