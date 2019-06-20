package pe.edu.adra.biaticos.entities.Informe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="actividad_diaria")
public class ActividadDiaria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="acd_id")
	private Long idActividadDiaria;
	private String fecha;
	private String descripcion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="inf_id", nullable = false)
	private Informe  informe;
	
	public ActividadDiaria() {
	}

	public ActividadDiaria(Long idActividadDiaria) {
		this.idActividadDiaria = idActividadDiaria;
	}

	public Long getIdActividadDiaria() {
		return idActividadDiaria;
	}

	public void setIdActividadDiaria(Long idActividadDiaria) {
		this.idActividadDiaria = idActividadDiaria;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Informe getInforme() {
		return informe;
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}
		
}
