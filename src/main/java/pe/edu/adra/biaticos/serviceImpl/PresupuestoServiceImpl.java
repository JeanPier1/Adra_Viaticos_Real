package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.PresupuestoDao;
import pe.edu.adra.biaticos.entities.Viajes.Presupuesto;
import pe.edu.adra.biaticos.service.PresupuestoService;


@Service
public class PresupuestoServiceImpl implements PresupuestoService {
	
	@Autowired
	private PresupuestoDao presupuestoDao;
	
	@Override
	public Presupuesto savePresupuesto(Presupuesto presupuesto) {
		return this.presupuestoDao.save(presupuesto);
	}

	@Override
	public List<Presupuesto> findAllPresupuesto() {
		return this.presupuestoDao.findAll();
	}

}
