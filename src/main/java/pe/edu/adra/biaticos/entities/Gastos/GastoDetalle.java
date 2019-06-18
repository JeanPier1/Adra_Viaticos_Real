package pe.edu.adra.biaticos.entities.Gastos;

import java.util.Date;

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
@Table(name="gasto_detalle")
public class GastoDetalle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gad_id")
	private Long idGastoDetalle;
	private Date fecha;
	private String motivo;
	private String destino;
	private Double total;
	private int estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="gast_id", nullable = false)
	private Gasto gasto;
	
	public GastoDetalle() {
	}

	public GastoDetalle(Long idGastoDetalle) {
		this.idGastoDetalle = idGastoDetalle;
	}

	public Long getIdGastoDetalle() {
		return idGastoDetalle;
	}

	public void setIdGastoDetalle(Long idGastoDetalle) {
		this.idGastoDetalle = idGastoDetalle;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}
	
}
