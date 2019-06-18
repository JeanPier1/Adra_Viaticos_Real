package pe.edu.adra.biaticos.entities.Viajes;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pe.edu.adra.biaticos.entities.Login.Cuenta;
import pe.edu.adra.biaticos.entities.Login.Persona;


@Entity
@Table(name="viaje")
public class Viaje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="via_id")
	private Long idViaje;
	private String motivo;
	private String sede;
	@Column(name="areacosto")
	private String areaCosto;
	private String moneda;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Column(name="fecha_inicio")
	private String fechaIncio;
	@Column(name="fecha_fin")
	private String fechaFin;
	@Column(name="pres_total")
	private Double presupuestoTotal;
	private int estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cue_id", nullable = false)
	private Cuenta cuenta;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="per_id", nullable = false)
	private Persona persona;
	

	@PrePersist
	public void prePersist() {
		this.fecha = new Date();
	}
	
	public Viaje() {
	}

	public Viaje(Long idViaje) {
		this.idViaje = idViaje;
	}

	public Long getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(Long idViaje) {
		this.idViaje = idViaje;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getAreaCosto() {
		return areaCosto;
	}

	public void setAreaCosto(String areaCosto) {
		this.areaCosto = areaCosto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFechaIncio() {
		return fechaIncio;
	}

	public void setFechaIncio(String fechaIncio) {
		this.fechaIncio = fechaIncio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(Double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
