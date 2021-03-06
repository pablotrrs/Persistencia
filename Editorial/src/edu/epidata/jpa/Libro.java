package edu.epidata.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Libro {
	@Id // Indica que es el identificador de las personas
	private int id;
	@Column
	private String nombre;
	@Column
	private int anio;
	@ManyToMany
	private List<Persona> editores = new ArrayList<>();
//Un libro tiene muchos cap�tulos, pero un capitulo est� en un solo libro
//El mapeo es realizado por Capitulo.
	@OneToMany(mappedBy = "libro")
	private List<Capitulo> capitulos = new ArrayList<>();

	public Libro() {
//Requerido
	}

	public Libro(int id, String nombre, int anio, List<Persona> editores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.anio = anio;
		this.editores = editores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public List<Persona> getEditores() {
		return editores;
	}

	public void setEditores(List<Persona> editores) {
		this.editores = editores;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", anio=" + anio + ", editores=" + editores + ", capitulos="
				+ capitulos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + ((capitulos == null) ? 0 : capitulos.hashCode());
		result = prime * result + ((editores == null) ? 0 : editores.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Libro))
			return false;
		Libro other = (Libro) obj;
		if (anio != other.anio)
			return false;
		if (capitulos == null) {
			if (other.capitulos != null)
				return false;
		} else if (!capitulos.equals(other.capitulos))
			return false;
		if (editores == null) {
			if (other.editores != null)
				return false;
		} else if (!editores.equals(other.editores))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}