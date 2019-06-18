package pe.edu.adra.biaticos.entities.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="permiso_rol")
public class PermisoRol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pr_id")
	private Long idPermisoRol;
		
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rol_id",nullable = false)
	private Rol Rol;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="per_id",nullable = false)
	private Permiso Permiso;

	public PermisoRol() {
	}

	public PermisoRol(Long idPermisoRol) {
		this.idPermisoRol = idPermisoRol;
	}

	public Long getIdPermisoRol() {
		return idPermisoRol;
	}

	public void setIdPermisoRol(Long idPermisoRol) {
		this.idPermisoRol = idPermisoRol;
	}

	public Rol getRol() {
		return Rol;
	}

	public void setRol(Rol rol) {
		Rol = rol;
	}

	public Permiso getPermiso() {
		return Permiso;
	}

	public void setPermiso(Permiso permiso) {
		Permiso = permiso;
	}

}
