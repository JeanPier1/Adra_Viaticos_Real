package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Informe.ActividadDiaria;


public interface ActividadDiariaService {
	
	ActividadDiaria saveActividadDiaria(ActividadDiaria actividadDiaria);
	
	List<ActividadDiaria> saveAllActividadDiaria(List<ActividadDiaria> actividadDiaria);
	
	
}
