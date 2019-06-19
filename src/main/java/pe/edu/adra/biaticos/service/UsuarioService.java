package pe.edu.adra.biaticos.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.query.Param;

import pe.edu.adra.biaticos.entities.Login.Persona;
import pe.edu.adra.biaticos.entities.Login.Usuario;



public interface UsuarioService {
	Usuario crear(Usuario p);
	Usuario editar(Usuario p);
	void eliminar(Long id);
	Usuario buscar(Long id);
	List<Usuario> listar();
	Persona buscarPersona(Long id);
	Object buscarDataUsuario(Long id);
	
	public Usuario findByUsername(String username);

	Object prueba(Long id);
	
	Object findDataByIdUsuario(Long id);
	List<Map<String,Object>> lista(@Param("id") long id);
	List<Map<String,Object>> listarCuenta(@Param("id") long id);
	List<Map<String,Object>> listarArea(@Param("id") long id);
	List<Map<String,Object>> listarRolid(@Param("id") long id);
	List<Map<String,Object>> listarPermisos(@Param("id") long id);

}
