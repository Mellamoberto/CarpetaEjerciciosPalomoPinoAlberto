package simulacro;

public class Productos {
	private int id;
	private String nombre;
	private String descripcion;
	private String fabricante;
	private int precio;
	private String numeroSerie;
	
	public Productos(int id, String nombre, String descripcion, String fabricante, int precio, String numeroSerie) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fabricante = fabricante;
		this.precio = precio;
		this.numeroSerie = numeroSerie;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getFabricante() {
		return fabricante;
	}


	public int getPrecio() {
		return precio;
	}


	public String getNumeroSerie() {
		return numeroSerie;
	}

	
	
	


}
