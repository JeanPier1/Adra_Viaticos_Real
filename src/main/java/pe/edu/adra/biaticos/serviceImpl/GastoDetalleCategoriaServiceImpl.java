package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.GastoDetalleCategoriaDao;
import pe.edu.adra.biaticos.entities.Gastos.GastoDetalleCategoria;
import pe.edu.adra.biaticos.service.GastoDetalleCategoriaService;

@Service
public class GastoDetalleCategoriaServiceImpl implements GastoDetalleCategoriaService {
	
	@Autowired
	private GastoDetalleCategoriaDao gastoDetalleCategoriaDao;
	
	@Override
	public List<GastoDetalleCategoria> saveAllGastoDetalleCategoria(List<GastoDetalleCategoria> gastoDetalleService) {
		return gastoDetalleCategoriaDao.saveAll(gastoDetalleService);
	}

	
}
