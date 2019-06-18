package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.SolicitadoDao;
import pe.edu.adra.biaticos.entities.Viajes.Solicitado;
import pe.edu.adra.biaticos.service.SolicitadoService;

@Service
public class SolicitadoServiceImpl implements SolicitadoService {

	@Autowired
	private SolicitadoDao solicitadoDao; 
	
	@Override
	public Solicitado saveSolicitado(Solicitado solicitado) {
		return this.solicitadoDao.save(solicitado);
	}

	@Override
	public List<Solicitado> findAllSolicitado() {
		return this.solicitadoDao.findAll();
	}

	@Override
	public List<Solicitado> saveAllSolicitado(List<Solicitado> solicitados) {
		return this.solicitadoDao.saveAll(solicitados);
	}

}
