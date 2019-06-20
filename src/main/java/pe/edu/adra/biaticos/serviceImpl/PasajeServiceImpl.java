package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.PasajeDao;
import pe.edu.adra.biaticos.entities.Viajes.Pasaje;
import pe.edu.adra.biaticos.service.PasajeService;


@Service
public class PasajeServiceImpl implements PasajeService {

	@Autowired
	private PasajeDao pasajeDao;

	@Override
	public Pasaje savePasaje(Pasaje pasaje) {
		return this.pasajeDao.save(pasaje);
	}

	@Override
	public List<Pasaje> findAllPasaje() {
		return this.pasajeDao.findAll();
	}

	@Override
	public List<Pasaje> saveAllActividad(List<Pasaje> pass) {
		// TODO Auto-generated method stub
		return pasajeDao.saveAll(pass);
	}

}
