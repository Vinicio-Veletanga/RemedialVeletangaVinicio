package ec.edu.ups.RemedialVeletangaVinicio.modelo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="libro")
public class Libro implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idl")
private int idl;
private String titulo;
private String editorial;
@OneToMany(mappedBy="autor")
private Set<Autor> autores;
private static final long serialVersionUID = 1L;

@OneToOne(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
@JoinColumn(name="id")
private Categoria categoria;

public int getIdl() {
	return idl;
}

public void setIdl(int idl) {
	this.idl = idl;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getEditorial() {
	return editorial;
}

public void setEditorial(String editorial) {
	this.editorial = editorial;
}

public Set<Autor> getAutores() {
	return autores;
}

public void setAutores(Set<Autor> autores) {
	this.autores = autores;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

@Override
public String toString() {
	return "Libro [idl=" + idl + ", titulo=" + titulo + ", editorial=" + editorial + ", autores=" + autores
			+ ", categoria=" + categoria + "]";
}


}
