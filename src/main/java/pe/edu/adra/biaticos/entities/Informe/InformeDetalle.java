package pe.edu.adra.biaticos.entities.Informe;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pe.edu.adra.biaticos.entities.Gastos.Gasto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
@Table(name="informe_detalle")
public class InformeDetalle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="infd_id")
	private Long idInformeDetalle;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="inf_id", nullable = false)
	private Informe informe;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="gast_id", nullable = false)
	private Gasto  gasto;
	
	@PrePersist
	public void prePersist() {
		this.fecha = new Date();
	}
	
	public InformeDetalle() {
	}

	public InformeDetalle(Long idInformeDetalle) {
		this.idInformeDetalle = idInformeDetalle;
	}

	public Long getIdInformeDetalle() {
		return idInformeDetalle;
	}

	public void setIdInformeDetalle(Long idInformeDetalle) {
		this.idInformeDetalle = idInformeDetalle;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Informe getInforme() {
		return informe;
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

}
