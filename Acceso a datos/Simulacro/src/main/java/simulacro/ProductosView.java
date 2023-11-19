package simulacro;

import java.util.List;

public class ProductosView {
	
	public void mostrarProductos(List<Productos> productos) {
		for (Productos producto : productos) {
			System.out.println("ID: "+producto.getId());
			System.out.println("Nombre: "+producto.getNombre());
			System.out.println("Descripcion: "+producto.getDescripcion());
			System.out.println("Fabricante: "+producto.getFabricante());
			System.out.println("Precio: "+producto.getPrecio());
			System.out.println("Numero Serie: "+producto.getNumeroSerie());
			System.out.println();
		}
	}
}
