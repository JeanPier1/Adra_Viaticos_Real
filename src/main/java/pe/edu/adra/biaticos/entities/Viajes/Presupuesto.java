package pe.edu.adra.biaticos.entities.Viajes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import pe.edu.adra.biaticos.entities.Gastos.Categoria;

@Entity
@Table(name="presupuesto")
public class Presupuesto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pres_id")
	private Long idPresupuesto;
	private Double detalle;
	private Double monto;
	private Double saldo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cat_id", nullable = false)
	private Categoria categoria;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="via_id", nullable = false)
	private Viaje viaje;
		
	public Presupuesto() {
	}

	public Presupuesto(Long idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	public Long getIdPresupuesto() {
		return idPresupuesto;
	}

	public void setIdPresupuesto(Long idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getDetalle() {
		return detalle;
	}

	public void setDetalle(Double detalle) {
		this.detalle = detalle;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
		
}
