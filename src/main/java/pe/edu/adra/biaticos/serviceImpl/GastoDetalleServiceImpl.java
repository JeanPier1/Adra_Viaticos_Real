package pe.edu.adra.biaticos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.GastoDetalleDao;
import pe.edu.adra.biaticos.entities.Gastos.GastoDetalle;
import pe.edu.adra.biaticos.service.GastoDetalleService;

@Service
public class GastoDetalleServiceImpl implements GastoDetalleService{

	@Autowired
	private GastoDetalleDao gastoDetalleDao;

	@Override
	public GastoDetalle saveGastoDetalle(GastoDetalle gastoDetalle) {
		return gastoDetalleDao.save(gastoDetalle);
	}

}
