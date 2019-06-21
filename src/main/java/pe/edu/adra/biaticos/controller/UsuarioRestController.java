package pe.edu.adra.biaticos.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.adra.biaticos.entities.Login.Cuenta;
import pe.edu.adra.biaticos.service.CuentaService;
import pe.edu.adra.biaticos.service.UsuarioService;


@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("/U")
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CuentaService cuentaService;
	
//	@GetMapping("/r/{id}")
//	public Persona BuscarPersona(@PathVariable Long id) {
//		return this.usuarioService.buscarPersona(id);
//	}
//		
//	@GetMapping("/usr/{id}")
//	public Object bucarDataUsuario(@PathVariable Long id) {
//		return this.usuarioService.buscarDataUsuario(id);
//	}

	@GetMapping("/{id}")
	public List<Map<String, Object>> lista(@PathVariable Long id){
		return usuarioService.lista(id);
	}
	
	@GetMapping("/cu/{id}")
	public List<Cuenta> listarCuentas(@PathVariable Long id){
		return cuentaService.findCuentasByUsuarioId(id);
	}
	
	@GetMapping("/ar/{id}")
	public List<Map<String, Object>> listarAreas(@PathVariable Long id){	
		return usuarioService.listarArea(id);
	}
	
	@GetMapping("/rol/{id}")
	public List<Map<String, Object>> listarRolId(@PathVariable Long id){
		return usuarioService.listarRolid(id);
	}
	@GetMapping("/permis/{id}")
	public List<Map<String, Object>> listarPermiso(@PathVariable Long id){
		return usuarioService.listarPermisos(id);
	}
}
