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

import pe.edu.adra.biaticos.entities.Login.Persona;


@Entity
@Table(name="solicitado")
public class Solicitado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sol_id")
	private Long idSolicitado;
	private String fecha;
	private String agencia;
	private String counter;
	private String hora;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="per_id", nullable = false)
	private Persona persona;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="via_id", nullable = false)
	private Viaje viaje;

	public Solicitado() {
	}

	public Solicitado(Long idSolicitado) {
		this.idSolicitado = idSolicitado;
	}

	public Long getIdSolicitado() {
		return idSolicitado;
	}

	public void setIdSolicitado(Long idSolicitado) {
		this.idSolicitado = idSolicitado;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCounter() {
		return counter;
	}

	public void setCounter(String counter) {
		this.counter = counter;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
