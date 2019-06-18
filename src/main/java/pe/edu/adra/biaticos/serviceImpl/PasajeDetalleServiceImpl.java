package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.PasajeDetalleDao;
import pe.edu.adra.biaticos.entities.Viajes.PasajeDetalle;
import pe.edu.adra.biaticos.service.PasajeDetalleService;



@Service
public class PasajeDetalleServiceImpl implements PasajeDetalleService {
	
	@Autowired
	private PasajeDetalleDao pasajeDetalleDao;

	@Override
	public PasajeDetalle savePasajeDetalle(PasajeDetalle pasajeDetalle) {
		return this.pasajeDetalleDao.save(pasajeDetalle);
	}

	@Override
	public List<PasajeDetalle> findAllPasajeDetalle() {
		return this.pasajeDetalleDao.findAll();
	}

	@Override
	public List<PasajeDetalle> saveAllPasajeDetalle(List<PasajeDetalle> pasajeDetalle) {
		return this.pasajeDetalleDao.saveAll(pasajeDetalle);
	}	
	
}
