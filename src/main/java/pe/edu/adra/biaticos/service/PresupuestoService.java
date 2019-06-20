package pe.edu.adra.biaticos.service;

import java.util.List;

import pe.edu.adra.biaticos.entities.Viajes.Presupuesto;


public interface PresupuestoService {

	Presupuesto savePresupuesto(Presupuesto presupuesto);
	
	List<Presupuesto> findAllPresupuesto();
	List<Presupuesto> saveAllActividad(List<Presupuesto> presupuestos);	

	
}
