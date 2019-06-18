package pe.edu.adra.biaticos.entities.Login;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
@Table(name="sede_area")
public class SedeArea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sa_id")
	private Long idSedeArea;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sed_id",nullable = false)
	private Sede sede;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="area_id",nullable = false)
	private Area area;
	
	@ManyToMany(mappedBy = "sede_area")
	private List<Usuario> usuarios;

	public SedeArea() {
	}

	public SedeArea(Long idSedeArea) {
		this.idSedeArea = idSedeArea;
	}

	public Long getIdSedeArea() {
		return idSedeArea;
	}

	public void setIdSedeArea(Long idSedeArea) {
		this.idSedeArea = idSedeArea;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
		
}
