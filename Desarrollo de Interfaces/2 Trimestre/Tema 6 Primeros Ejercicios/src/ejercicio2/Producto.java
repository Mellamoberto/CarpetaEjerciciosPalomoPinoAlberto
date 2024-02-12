package ejercicio2;

import javafx.beans.property.*;


public class Producto {
	 private StringProperty nombre = new SimpleStringProperty();
	    private DoubleProperty precio = new SimpleDoubleProperty();
	    private IntegerProperty codigoFabricante = new SimpleIntegerProperty();
	    
	public Producto(int id, String nombre, Double precio, int codigoFabricante) {
		this.nombre.set(nombre);
        this.precio.set(precio);
        this.codigoFabricante.set(codigoFabricante);
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}

	public DoubleProperty getPrecio() {
		return precio;
	}

	public void setPrecio(DoubleProperty precio) {
		this.precio = precio;
	}

	public IntegerProperty getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(IntegerProperty codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}
	
	
	
    public StringProperty nombreProperty() {
        return nombre;
    }
    
    
    public IntegerProperty codigoFabricanteProperty() {
        return codigoFabricante;
    }
    
    
    public DoubleProperty precioProperty() {
        return precio;
    }
	
	

}
