package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {
    @Id
    private int id;
    private String nombre;
    private String pais;

    public Empresa() {
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", pais=" + pais + "]";
	}
    
    
}