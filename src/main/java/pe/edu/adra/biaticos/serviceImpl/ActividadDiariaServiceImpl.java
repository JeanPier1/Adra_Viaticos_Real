package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.ActividadDiariaDao;
import pe.edu.adra.biaticos.entities.Informe.ActividadDiaria;
import pe.edu.adra.biaticos.service.ActividadDiariaService;

@Service
public class ActividadDiariaServiceImpl implements ActividadDiariaService {

	@Autowired
	private ActividadDiariaDao actividadDiariaDao;
	
	@Override
	public ActividadDiaria saveActividadDiaria(ActividadDiaria actividadDiaria) {
		return actividadDiariaDao.save(actividadDiaria);
	}

	@Override
	public List<ActividadDiaria> saveAllActividadDiaria(List<ActividadDiaria> actividadDiaria) {
		return actividadDiariaDao.saveAll(actividadDiaria);
	}

	

}
