package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Viajes.Viaje;


public interface ViajeService {
	
	Viaje saveViaje(Viaje viaje);
	
	List<Viaje> readAllViajes(Long id);
	
	List<Viaje> readAllSolicitudes(Long id);
	
	Viaje findViajeById(Long id);
}
