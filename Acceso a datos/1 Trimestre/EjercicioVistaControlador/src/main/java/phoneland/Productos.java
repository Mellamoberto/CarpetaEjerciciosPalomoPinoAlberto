package phoneland;

public class Productos {
	private int id_producto;
	private int id_proveedor;
	private String nombre;
	private String fabricante;
	private String precio;
	private String pvp;
	private String descripcion;
	private String columna8;
	
	public Productos(int id_producto, int id_proveedor, String nombre, String fabricante, String precio,
			String pvp, String descripcion, String columna8) {
		super();
		this.id_producto = id_producto;
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.pvp = pvp;
		this.descripcion = descripcion;
		this.columna8 = columna8;
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

	public String getPrecio() {
		return precio;
	}
	
	public String getPvp() {
		return pvp;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public String getColumna8() {
		return columna8;
	}

	
}
