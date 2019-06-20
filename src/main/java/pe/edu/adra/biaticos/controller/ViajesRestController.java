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
	private ActividadService actividadSer;
	
	@Autowired
	private ViajeService viajeser;

	@Autowired
	private PasajeDetalleService pasjaDetallSer;
	
	@Autowired
	private PasajeService pasjServi;
	
	@Autowired
	private SolicitadoService solicitudServi;
	
	@Autowired
	private PresupuestoService presu;
	
	/*
	 * 	@PostMapping("/pas/solicitado")
	public List<Solicitado> guardarSolicitado(@RequestBody List<Solicitado> solicitados) {
		return this.solicitadoService.saveAllSolicitado(solicitados);
	}*/
	@GetMapping("/lis")
	public List<Viaje> vista(){
		return viajeser.readViajes();
	}
	
	@PostMapping("/crearvia")
	public Viaje guardarPasaje(@RequestBody Viaje via) {
		return viajeser.saveViaje(via);
	}
	
	@PostMapping("/actividad")
	public List<Actividad> guardarActividad(@RequestBody List<Actividad> activ){
		return actividadSer.saveAllActividad(activ);
	}
	@PostMapping("/pasaje")
	public List<Pasaje> guardarPasaje(@RequestBody List<Pasaje> pass){
		return pasjServi.saveAllActividad(pass);
	}
	@PostMapping("/solicitud")
	public List<Solicitado> guardarSolicitud(@RequestBody List<Solicitado> solic){
		return solicitudServi.saveAllSolicitado(solic);
	}
	
	@PostMapping("/presupuesto")
	public List<Presupuesto> guardarPresupuesto(@RequestBody List<Presupuesto> pres){
		return presu.saveAllActividad(pres);
	}
	
	@PostMapping("/pasaje-detalle")
	public List<PasajeDetalle> guardarPasajeDetalle(@RequestBody List<PasajeDetalle> pasDetalle){
		return pasjaDetallSer.saveAllPasajeDetalle(pasDetalle);
	}
	
	
}
