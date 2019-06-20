package pe.edu.adra.biaticos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Login.Cuenta;

@Repository
public interface CuentaDao extends JpaRepository<Cuenta, Integer>{
	
	@Query(value = "select c.* from cuenta c, sede se, sede_area sear,  users_sede_area use_are,usuario user\r\n" + 
			"where  se.sed_id= c.sed_id and sear.sed_id=se.sed_id  \r\n" + 
			"and use_are.usuario_id=user.usu_id and use_are.sea_id=sear.sa_id and user.usu_id=:id", nativeQuery = true)
	public List<Cuenta> ListaCuentas(Long id);
	
}
