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

import pe.edu.adra.biaticos.entities.Viajes.Viaje;


@Entity
@Table(name="gasto")
public class Gasto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gast_id")
	private Long idGasto;
	private String fecha;
	private int tipo;
	private Double total;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="via_id", nullable = false)
	private Viaje viaje;
	
	public Gasto() {
	}

	public Gasto(Long idGasto) {
		this.idGasto = idGasto;
	}

	public Long getIdGasto() {
		return idGasto;
	}

	public void setIdGasto(Long idGasto) {
		this.idGasto = idGasto;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
		
}
