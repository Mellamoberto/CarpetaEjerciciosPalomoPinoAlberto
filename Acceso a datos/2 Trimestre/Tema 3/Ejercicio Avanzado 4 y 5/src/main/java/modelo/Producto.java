package modelo;

import java.sql.Date;
import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int id;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private float precio;
	
    @ManyToOne
    @JoinColumn(name = "codigo_fabricante", nullable = false)
    private Fabricante fabricante;

    
	public Producto() {
		super();
	}

	public Producto(String nombre, float precio, Fabricante fabricante) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante.getNombre() + "]";
	}
}
