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

import pe.edu.upeu.spring.entities.Viaje.Viaje;

@Entity
@Table(name="informe")
public class Informe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="inf_id")
	private Long idInforme;
	private String proposito;
	private String resumen;
	private String participantes;
	private String estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="via_id", nullable = false)
	private Viaje viaje;
	
	public Informe() {
	}

	public Informe(Long idInforme) {
		this.idInforme = idInforme;
	}

	public Long getIdInforme() {
		return idInforme;
	}

	public void setIdInforme(Long idInforme) {
		this.idInforme = idInforme;
	}

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getParticipantes() {
		return participantes;
	}

	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}	

}
