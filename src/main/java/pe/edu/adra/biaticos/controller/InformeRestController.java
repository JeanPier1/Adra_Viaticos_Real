package pe.edu.adra.biaticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.spring.entities.Informe.ActividadDiaria;
import pe.edu.upeu.spring.entities.Informe.Informe;
import pe.edu.upeu.spring.service.ActividadDiariaService;
import pe.edu.upeu.spring.service.InformeService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/Inf")
public class InformeRestController {

	@Autowired
	private InformeService informeService;
	
	@Autowired
	private ActividadDiariaService actividadDiariaService;
	
	@PostMapping("/informe")
	public Informe GuardarInforme(@RequestBody Informe informe) {
		return this.informeService.saveInforme(informe);
	}
	
	@PostMapping("/actDiaria")
	public List<ActividadDiaria> GuardarListaActividadesDiarias(@RequestBody List<ActividadDiaria> actividadDiaria) {
		return this.actividadDiariaService.saveAllActividadDiaria(actividadDiaria);
	}

}
