package modelo;

import java.sql.Date;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "compras")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcompras")
	private int id;
	
	@Column(name = "fecha")
	private Date fecha;
	
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
	
	@Column(name = "unidades")
	private int unidades;

	
	
	public Compra() {
		super();
	}


	public Compra(Date fecha, Producto producto, int unidades) {
		super();
		this.fecha = fecha;
		this.producto = producto;
		this.unidades = unidades;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public String toString() {
		return "Compra [id=" + id + ", fecha=" + fecha + ", producto=" + producto.getNombre() + ", unidades=" + unidades + "]";
	}
}
