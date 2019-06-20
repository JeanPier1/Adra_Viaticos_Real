package pe.edu.adra.biaticos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.adra.biaticos.dao.CuentaDao;
import pe.edu.adra.biaticos.entities.Login.Cuenta;
import pe.edu.adra.biaticos.service.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	private CuentaDao cuentaDao;
	
	@Override
	public Cuenta saveCuenta(Cuenta cuenta) {
		return cuentaDao.save(cuenta);
	}

	@Override
	public List<Cuenta> findCuentasByUsuarioId(Long id) {
		return cuentaDao.ListaCuentas(id);
	}
	
}
