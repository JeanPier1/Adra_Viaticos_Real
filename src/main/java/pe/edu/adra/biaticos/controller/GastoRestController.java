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

import pe.edu.adra.biaticos.entities.Gastos.Gasto;
import pe.edu.adra.biaticos.entities.Gastos.GastoDetalle;
import pe.edu.adra.biaticos.entities.Gastos.GastoDetalleCategoria;
import pe.edu.adra.biaticos.entities.Viajes.Viaje;
import pe.edu.adra.biaticos.service.GastoDetalleCategoriaService;
import pe.edu.adra.biaticos.service.GastoDetalleService;
import pe.edu.adra.biaticos.service.GastoService;
import pe.edu.adra.biaticos.service.ViajeService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/Gt")
public class GastoRestController {

	@Autowired
	private ViajeService viajeService;
	
	@Autowired
	private GastoService gastoService;
	
	@Autowired
	private GastoDetalleService gastoDetalleService;
	
	@Autowired
	private GastoDetalleCategoriaService gastoDetalleCategoriaService;
	  
	@GetMapping("/viaje/{id}")
	public Viaje BuscarViajeById(@PathVariable Long id) {
		return this.viajeService.findViajeById(id);
	}
	
	@PostMapping("/gasto")
	public Gasto GuardarGasto(@RequestBody Gasto gasto) {
		return this.gastoService.saveGasto(gasto);
	}
	
	@PostMapping("/gastoDet")
	public GastoDetalle GuardarGastoDetalle(@RequestBody GastoDetalle gastoDetalle) {
		return this.gastoDetalleService.saveGastoDetalle(gastoDetalle);
	}
	
	@PostMapping("/gDetCat")
	public List<GastoDetalleCategoria> GuardarGastoDetalleCategoria(@RequestBody List<GastoDetalleCategoria> gastoDetalleCategoria) {
		return gastoDetalleCategoriaService.saveAllGastoDetalleCategoria(gastoDetalleCategoria);
	}
	

}
