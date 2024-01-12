package modelo;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "tvideojuegos")

public class Videojuego {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idjuego")
	private int idjuego;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "anio")
	private int anio;
	
	@Column(name = "empresa")
	private String empresa;
	
	@Column(name = "precio")
	private float precio;
	
	@Column(name = "sinopsis")
	private String sinopsis;
	
	@Column(name = "plataforma")
	private String plataforma;

	
	public Videojuego() {
	}


	public Videojuego(String nombre, int anio, String empresa, float precio, String sinopsis,
			String plataforma) {
		super();
		this.nombre = nombre;
		this.anio = anio;
		this.empresa = empresa;
		this.precio = precio;
		this.sinopsis = sinopsis;
		this.plataforma = plataforma;
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


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getSinopsis() {
		return sinopsis;
	}


	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	@Override
	public String toString() {
		return "Videojuego [idjuego=" + idjuego + ", nombre=" + nombre + ", anio=" + anio + ", empresa=" + empresa
				+ ", precio=" + precio + ", sinopsis=" + sinopsis + ", plataforma=" + plataforma + "]";
	}
	
	
}