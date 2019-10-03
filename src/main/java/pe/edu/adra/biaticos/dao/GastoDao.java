package pe.edu.adra.biaticos.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.adra.biaticos.entities.Gastos.Gasto;


@Repository
public interface GastoDao extends JpaRepository<Gasto, Long> {

	@Query(value="select DISTINCT ga.gast_id as idgasto,ga.fecha,gastde.motivo,gastde.destino,gastde.total \r\n" + 
			"from gasto ga, gasto_detalle gastde, gast_detalle_cat gastdetc, categoria cat , viaje via\r\n" + 
			"where ga.gast_id=gastde.gast_id and gastdetc.gad_id=gastde.gad_id and cat.cat_id=gastdetc.cat_id \r\n" + 
			"and ga.via_id=via.via_id and ga.via_id=:idviajes",nativeQuery = true)
	public List<Map<String,Object>> listaMax(@Param("idviajes") long idviajes);
	
	
	@Query(value="select gast_id from gasto where via_id=:idviaje",nativeQuery = true)
	public List<Map<String,Object>> listaidgasto(@Param("idviaje") long idviajes);

	
	@Query(value ="select gastdetc.monto,cat.nombre \r\n" + 
			"from gasto ga, gasto_detalle gastde, gast_detalle_cat gastdetc, categoria cat , viaje via\r\n" + 
			"where ga.gast_id=gastde.gast_id and gastdetc.gad_id=gastde.gad_id and cat.cat_id=gastdetc.cat_id \r\n" + 
			"and ga.via_id=via.via_id and ga.via_id=:idviaje and ga.gast_id=:idgasto",nativeQuery = true)
	public List<Map<String,Object>> listaparametros(@Param("idviaje") long idviajes,@Param ("idgasto") long idgasto);
}
