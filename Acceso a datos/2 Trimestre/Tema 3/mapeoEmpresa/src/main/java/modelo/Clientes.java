package modelo;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "clientes")

public class Clientes {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;

		@Column(name = "nombre")
		private String nombre;
		
		@Column(name = "ciudad")
		private String ciudad;

		
		public Clientes() {
		}

		public Clientes(String nombre, String ciudad) {
			this.nombre = nombre;
			this.ciudad = ciudad;
		}
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public String getCiudad() {
			return ciudad;
		}
		
		public void setCiudad(String nif) {
			this.ciudad = ciudad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Cliente{" + "id=" + id + ", nombre='" + nombre + ", ciudad='" + ciudad + '\'' + '}';
		}
	}
