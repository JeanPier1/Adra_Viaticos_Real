package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Viajes.Actividad;


public interface ActividadService {
	
	Actividad saveActividad(Actividad actividad);
	
	List<Actividad> findAllActividad();
	
	List<Actividad> saveAllActividad(List<Actividad> actividades);	
	
}
