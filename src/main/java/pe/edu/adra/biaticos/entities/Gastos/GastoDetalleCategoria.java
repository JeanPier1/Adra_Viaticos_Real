package pe.edu.adra.biaticos.entities.Gastos;

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
@Table(name="gast_detalle_cat")
public class GastoDetalleCategoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gdc_id")
	private Long idGastoDetalleCategoria;
	private String monto;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="gad_id", nullable = false)
	private GastoDetalle gastoDetalle;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cat_id", nullable = false)
	private Categoria categoria;

	public GastoDetalleCategoria() {
	}

	public GastoDetalleCategoria(Long idGastoDetalleCategoria) {
		this.idGastoDetalleCategoria = idGastoDetalleCategoria;
	}

	public Long getIdGastoDetalleCategoria() {
		return idGastoDetalleCategoria;
	}

	public void setIdGastoDetalleCategoria(Long idGastoDetalleCategoria) {
		this.idGastoDetalleCategoria = idGastoDetalleCategoria;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public GastoDetalle getGastoDetalle() {
		return gastoDetalle;
	}

	public void setGastoDetalle(GastoDetalle gastoDetalle) {
		this.gastoDetalle = gastoDetalle;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
