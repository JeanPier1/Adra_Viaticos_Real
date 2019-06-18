package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Viajes.Solicitado;


public interface SolicitadoService {
	
	Solicitado saveSolicitado(Solicitado solicitado);
	
	List<Solicitado> findAllSolicitado();
	
	List<Solicitado> saveAllSolicitado(List<Solicitado> solicitados);

}
