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
	
	
	@Query(value = "select c.* from cuenta c, sede se, sede_area sear,  users_sede_area use_are,usuario user\r\n" + 
			"where  se.sed_id= c.sed_id and sear.sed_id=se.sed_id  \r\n" + 
			"and use_are.usuario_id=user.usu_id and use_are.sea_id=sear.sa_id and user.usu_id=:id", nativeQuery = true)
	public List<Map<String,Object>> ListaCuentas(@Param("id") long id);

	@Query(value = "select ar.* \r\n" + 
			"from sede_area sedare, area ar, users_sede_area usersea, usuario usere\r\n" + 
			"where sedare.area_id= ar.area_id and usersea.sea_id=sedare.sa_id  \r\n" + 
			"and usersea.sea_id=sedare.sa_id and usere.usu_id = usersea.usuario_id and usere.usu_id=:id",nativeQuery = true)
	public List<Map<String,Object>> ListaAreas(@Param("id") long id);

	@Query(value = "select r.rol_id from rol r, usuario us, usuarios_roles usaa\r\n" + 
			"where r.rol_id=usaa.role_id and usaa.usuario_id=us.usu_id and usu_id=:id", nativeQuery = true)
	public List<Map<String,Object>> Listarolid(@Param("id") long id);
	

	@Query(value = "select men.* from permiso_rol pers, rol r, permiso per, menu men\r\n" + 
			"where pers.per_id=per.per_id and pers.rol_id=r.rol_id and per.per_id=men.per_id\r\n" + 
			"and r.rol_id=:id", nativeQuery = true)
	public List<Map<String,Object>> ListaPermisos(@Param("id") long id);
}
