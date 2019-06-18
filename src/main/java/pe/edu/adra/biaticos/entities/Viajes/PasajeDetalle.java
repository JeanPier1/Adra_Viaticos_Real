package pe.edu.adra.biaticos.entities.Viajes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pasaje_detalle")
public class PasajeDetalle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pad_id")
	private Long idPasajeDetalle;
	private String fecha;
	private String hora;
	private String tipo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="pas_id", nullable = false)
	private Pasaje pasaje;
	
	public PasajeDetalle() {
	}

	public PasajeDetalle(Long idPasajeDetalle) {
		this.idPasajeDetalle = idPasajeDetalle;
	}

	public Long getIdPasajeDetalle() {
		return idPasajeDetalle;
	}

	public void setIdPasajeDetalle(Long idPasajeDetalle) {
		this.idPasajeDetalle = idPasajeDetalle;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}

}
