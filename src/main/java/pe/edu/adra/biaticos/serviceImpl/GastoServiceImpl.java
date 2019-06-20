package pe.edu.adra.biaticos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.GastoDao;
import pe.edu.adra.biaticos.entities.Gastos.Gasto;
import pe.edu.adra.biaticos.service.GastoService;

@Service
public class GastoServiceImpl implements GastoService{

	@Autowired
	private GastoDao gastoDao;
	
	@Override
	public Gasto saveGasto(Gasto gasto) {
		return gastoDao.save(gasto);
	}

	

}
