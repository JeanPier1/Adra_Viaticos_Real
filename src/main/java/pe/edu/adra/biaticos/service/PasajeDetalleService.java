package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Viajes.PasajeDetalle;


public interface PasajeDetalleService {

	PasajeDetalle savePasajeDetalle(PasajeDetalle pasajeDetalle);
	
	List<PasajeDetalle> findAllPasajeDetalle();
	
	List<PasajeDetalle> saveAllPasajeDetalle(List<PasajeDetalle> pasajeDetalle);
	
}
