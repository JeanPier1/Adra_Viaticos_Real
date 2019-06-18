package pe.edu.adra.biaticos.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Login.Usuario;



@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
	
//	@Query("select p from Persona p, Usuario u where u.persona.idPersona = p.idPersona and u.idUsuario = ?1")
//	public Persona findPersona(Long id);
//	
//	@Query(value="select p , rl  from Persona p, Usuario u, UsuRol usr, SaRol sar, Rol rl where "
//			+ "u.idUsuario = ?1 and "
//			+ "u.persona.idPersona = p.idPersona and " 
//			+ "rl.idRol = sar.rol.idRol and "
//			+ "sar.idSaRol = usr.saRol.idSaRol and "
//			+ "u.idUsuario = usr.usuario.idUsuario")
//	public Object findDataByIdUsuario(Long id);
//	
//	@Query(value=" select p.* from persona p }", nativeQuery=true)
//	public List<Map<String,String>> findByIdUsuarioV4(Long id);
//	
//	@Query(value="{ call asdasd(?1) }", nativeQuery=true)
//	public Object proce(Long id);
//	
//	@Query(value="{ call asdasd(?1) }", nativeQuery=true)
//	public List<Map<String,Object>> procev2(Long id);
//	
	
//	@Query(value="select p , r  from Persona p, Rol r where p.idPersona = ?1", nativeQuery=true)
//	public Object findByIdUsuarioV3(Long id);

//	@Query(nativeQuery = true, value = "SELECT PKG_TEST.HELLO_WORLD(:text) FROM dual")
//    String callHelloWorld(@Param("text") String text);
	public Usuario findByUsername(String username);
	
	@Query(value="select (ar.nombre) as Area, se.sed_id, (se.nombre) as Sede ,cu.banco,cu.numero "
			+ "from users_sede_area  usa, sede_area sea, area ar, sede se, cuenta cu where usa.sea_id=sea.sa_id and sea.area_id=ar.area_id and sea.sed_id=se.sed_id and cu.sed_id=se.sed_id  and usa.usuario_id=:id",nativeQuery = true)
	public List<Map<String,Object>> lista(@Param("id") long id);

}
