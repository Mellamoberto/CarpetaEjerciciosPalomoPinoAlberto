package phoneland;

public class Productos {
	private int id_producto;
	private int id_proveedor;
	private String nombre;
	private String fabricante;
	private float precio;
	private String descripcion;
	
	public Productos(int id_producto, int id_proveedor, String nombre, String fabricante, float precio,
			String descripcion) {
		super();
		this.id_producto = id_producto;
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public int getId_producto() {
		return id_producto;
	}

	public int getId_proveedor() {
		return id_proveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFabricante() {
		return fabricante;
	}

	public float getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	
}
