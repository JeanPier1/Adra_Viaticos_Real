package pe.edu.adra.biaticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.adra.biaticos.entities.Viajes.Actividad;
import pe.edu.adra.biaticos.entities.Viajes.Pasaje;
import pe.edu.adra.biaticos.entities.Viajes.PasajeDetalle;
import pe.edu.adra.biaticos.entities.Viajes.Presupuesto;
import pe.edu.adra.biaticos.entities.Viajes.Solicitado;
import pe.edu.adra.biaticos.entities.Viajes.Viaje;
import pe.edu.adra.biaticos.service.ActividadService;
import pe.edu.adra.biaticos.service.PasajeDetalleService;
import pe.edu.adra.biaticos.service.PasajeService;
import pe.edu.adra.biaticos.service.PresupuestoService;
import pe.edu.adra.biaticos.service.SolicitadoService;
import pe.edu.adra.biaticos.service.ViajeService;


@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("/V")
public class ViajesRestController {
	
	@Autowired
	private ActividadService actividadService;
	
	@Autowired
	private ViajeService viajeService;

	@Autowired
	private PasajeDetalleService pasajeDetalleService;
	
	@Autowired
	private PasajeService pasajeService;
	
	@Autowired
	private SolicitadoService solicitudService;
	
	@Autowired
	private PresupuestoService presupuestoService;
	
	/*
	 * 	@PostMapping("/pas/solicitado")
	public List<Solicitado> guardarSolicitado(@RequestBody List<Solicitado> solicitados) {
		return this.solicitadoService.saveAllSolicitado(solicitados);
	}*/
	@GetMapping("/lis")
	public List<Viaje> vista(){
		return viajeService.readViajes();
	}
	
	@PostMapping("/viaje")
	public Viaje guardarPasaje(@RequestBody Viaje viaje) {
		return viajeService.saveViaje(viaje);
	}
	
	@PostMapping("/actividad")
	public List<Actividad> guardarActividad(@RequestBody List<Actividad> actividad){
		System.out.println(actividad.size());
		return actividadService.saveAllActividad(actividad);
	}
	
	@PostMapping("/pasaje")
	public Pasaje guardarPasaje(@RequestBody Pasaje pasaje){
		return pasajeService.savePasaje(pasaje);
	}
	
	@PostMapping("/pasaje-detalle")
	public List<PasajeDetalle> guardarPasajeDetalle(@RequestBody List<PasajeDetalle> pasajeDetalle){
		return pasajeDetalleService.saveAllPasajeDetalle(pasajeDetalle);
	}
	
	@PostMapping("/solicitud")
	public List<Solicitado> guardarSolicitado(@RequestBody List<Solicitado> solicitud){
		return solicitudService.saveAllSolicitado(solicitud);
	}
	
	@PostMapping("/presupuesto")
	public List<Presupuesto> guardarPresupuesto(@RequestBody List<Presupuesto> presupuesto){
		return presupuestoService.saveAllActividad(presupuesto);
	}			
	
}
