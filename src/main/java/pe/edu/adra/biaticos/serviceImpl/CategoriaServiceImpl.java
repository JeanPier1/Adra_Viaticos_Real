package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.CategoriaDao;
import pe.edu.adra.biaticos.entities.Gastos.Categoria;
import pe.edu.adra.biaticos.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	
	@Autowired
	private CategoriaDao categoriaDao;
	
	@Override
	public List<Categoria> findCategoriasPadre() {
		return categoriaDao.findCategoriasPadre();
	}

	

}
