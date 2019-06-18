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


@Entity
@Table(name="pasaje")
public class Pasaje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pas_id")
	private Long idPasaje;
	private String linea;
	private String vuelo;
	private String hora;
	private Double precio;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="via_id", nullable = false)
	private Viaje viaje;
	
	public Pasaje() {
	}

	public Pasaje(Long idPasaje) {
		this.idPasaje = idPasaje;
	}

	public Long getIdPasaje() {
		return idPasaje;
	}

	public void setIdPasaje(Long idPasaje) {
		this.idPasaje = idPasaje;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getVuelo() {
		return vuelo;
	}

	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}
	
}
