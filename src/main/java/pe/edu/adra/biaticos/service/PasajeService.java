package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Viajes.Pasaje;

public interface PasajeService {

	Pasaje savePasaje(Pasaje pasaje);
	
	List<Pasaje> findAllPasaje();
	
	List<Pasaje> saveAllActividad(List<Pasaje> pass);	

}
