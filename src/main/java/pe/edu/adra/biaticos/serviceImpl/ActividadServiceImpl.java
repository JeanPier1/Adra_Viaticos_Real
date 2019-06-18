package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.ActividadDao;
import pe.edu.adra.biaticos.entities.Viajes.Actividad;
import pe.edu.adra.biaticos.service.ActividadService;

@Service
public class ActividadServiceImpl implements ActividadService {
	
	@Autowired
	private ActividadDao actividadDao;

	@Override
	public Actividad saveActividad(Actividad actividad) {
		return this.actividadDao.save(actividad);
	}

	@Override
	public List<Actividad> findAllActividad() {
		return this.actividadDao.findAll();
	}

	@Override
	public List<Actividad> saveAllActividad(List<Actividad> actividades) {
		return this.saveAllActividad(actividades);
	}
	
}
