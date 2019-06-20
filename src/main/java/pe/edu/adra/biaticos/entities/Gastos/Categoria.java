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
@Table(name="categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cat_id")
	private Long idCategoria;
	private String nombre;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cat_child", nullable = false)
	private Categoria categoriaChid;
	
	public Categoria() {
	}

	public Categoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoriaChid() {
		return categoriaChid;
	}

	public void setCategoriaChid(Categoria categoriaChid) {
		this.categoriaChid = categoriaChid;
	}
	
}
