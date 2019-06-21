package pe.edu.adra.biaticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.adra.biaticos.entities.Login.Persona;
import pe.edu.adra.biaticos.entities.Viajes.Actividad;
import pe.edu.adra.biaticos.entities.Viajes.Pasaje;
import pe.edu.adra.biaticos.entities.Viajes.PasajeDetalle;
import pe.edu.adra.biaticos.entities.Viajes.Solicitado;
import pe.edu.adra.biaticos.service.ActividadService;
import pe.edu.adra.biaticos.service.PasajeDetalleService;
import pe.edu.adra.biaticos.service.PasajeService;
import pe.edu.adra.biaticos.service.PersonaService;
import pe.edu.adra.biaticos.service.SolicitadoService;


@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("/S")
public class SolicitudRestController {
	
	@Autowired
	private ActividadService actividadService;
	
	@Autowired
	private PasajeService pasajeService;
	
	@Autowired
	private PasajeDetalleService pasajeDetalleService;
	
	@Autowired
	private SolicitadoService solicitadoService;
	
	@Autowired
	private PersonaService personaService;
	
	@PostMapping("/actividad")
	public List<Actividad> guardarActividad(@RequestBody List<Actividad> actividades) {
		return this.actividadService.saveAllActividad(actividades);
	}	
	
	@PostMapping("/pasaje")
	public Pasaje guardarPasaje(@RequestBody Pasaje pasaje) { 
		return this.pasajeService.savePasaje(pasaje);
	}
	
	@PostMapping("/pas/det")
	public List<PasajeDetalle> guardarPasajeDetalle(@RequestBody List<PasajeDetalle> pasajeDetalle) {
		return this.pasajeDetalleService.saveAllPasajeDetalle(pasajeDetalle);
	}
	
	@PostMapping("/pas/solicitado")
	public List<Solicitado> guardarSolicitado(@RequestBody List<Solicitado> solicitados) {
		return this.solicitadoService.saveAllSolicitado(solicitados);
	}
	
	@GetMapping("/contacto/{nombre}")
	public List<Persona> buscarContactoById(@PathVariable String nombre) {
		return this.personaService.findContactoByNombre(nombre);
	}

	
	

}
