package phoneland;

import java.util.List;

public class ProductosView {
	
	private int id_producto;
	private int id_proveedor;
	private String nombre;
	private String fabricante;
	private float precio;
	private String descripcion;
	
	public void mostrarProductos(List<Productos> productos) {
		for (Productos producto : productos) {
			System.out.println("ID_Producto: "+producto.getId_producto());
			System.out.println("ID_Proveedor: "+producto.getId_proveedor());
			System.out.println("Nombre: "+producto.getNombre());
			System.out.println("Fabricante: "+producto.getFabricante());
			System.out.println("Precio: "+producto.getPrecio());
			System.out.println("Descripcion: "+producto.getDescripcion());
			System.out.println();
		}
	}
}
