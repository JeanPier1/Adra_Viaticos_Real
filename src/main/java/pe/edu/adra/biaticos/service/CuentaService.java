package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Login.Cuenta;

public interface CuentaService {
	
	Cuenta saveCuenta(Cuenta cuenta);
	
	List<Cuenta> findCuentasByUsuarioId(Long id);
}
