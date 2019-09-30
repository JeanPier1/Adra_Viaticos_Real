package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.ViajeDao;
import pe.edu.adra.biaticos.entities.Viajes.Viaje;
import pe.edu.adra.biaticos.service.ViajeService;

@Service
public class ViajeServiceImpl  implements ViajeService{

	@Autowired
	private ViajeDao viajeDao;

	@Override
	public Viaje saveViaje(Viaje viaje) {
		return this.viajeDao.save(viaje);
	}

	@Override
	public List<Viaje> readAllViajes(Long id) {
		return this.viajeDao.findViajeSuccess(id);
	}

	@Override
	public Viaje findViajeById(Long id) {
		return this.viajeDao.findById(id).orElse(null);
	}

	@Override
	public List<Viaje> readAllSolicitudes(Long id) {
		return this.viajeDao.findAllById(id);
	}
	
}
