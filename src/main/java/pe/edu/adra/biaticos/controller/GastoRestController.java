package pe.edu.adra.biaticos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.adra.biaticos.entities.Viajes.Viaje;
import pe.edu.adra.biaticos.service.ViajeService;



@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/Gt")
public class GastoRestController {

	@Autowired
	private ViajeService viajeService;
	
	@GetMapping("/viaje/{id}")
	public Viaje BuscarViajeById(@PathVariable Long id) {
		return this.viajeService.findViajeById(id);
	}
	

}
