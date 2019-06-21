package pe.edu.adra.biaticos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.InformeDao;
import pe.edu.adra.biaticos.entities.Informe.Informe;
import pe.edu.adra.biaticos.service.InformeService;



@Service
public class InformeServiceImpl implements InformeService{

	@Autowired
	private  InformeDao informeDao;

	
	@Override
	public Informe saveInforme(Informe informe) {
		return this.informeDao.save(informe);
	}

	@Override
	public void deleteInforme(Long id) {
		this.informeDao.deleteById(id);
	}

	
}
